package com.Daniel.service;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Daniel.repository.ImpuestoRepository;
import com.Daniel.request.CreateImpuestoRequest;
import com.Daniel.response.AvaluoResponse;
import com.Daniel.response.ImpuestoResponse;
import com.Daniel.response.VehiculoResponse;
import com.Daniel.entity.Impuesto;
import com.Daniel.feingclients.AvaluoFeingClient;
import com.Daniel.feingclients.VehiculoFeingClient;



@Service
public class ImpuestoService {
	
	@Autowired
	VehiculoFeingClient vehiculoFeignClient;
	
	@Autowired
	AvaluoFeingClient avaluoFeingClient;
	
	@Autowired
	ImpuestoRepository impuestoRepository;
	
	public ImpuestoResponse CreateImpuesto(CreateImpuestoRequest createImpuestoRequest) {

		Impuesto impuesto = new Impuesto();
		
		impuesto.setPlaca(createImpuestoRequest.getVehiculo_placa());
		
		VehiculoResponse vehiculoResponse = vehiculoFeignClient.getById(createImpuestoRequest.getVehiculo_placa());
		AvaluoResponse avaluoResponse = avaluoFeingClient.getAvaluo(vehiculoResponse.getClaseResponse().getId_clase(), 
				vehiculoResponse.getModelo(), vehiculoResponse.getCilindraje(), vehiculoResponse.getLineaResponse().getId_linea());
		
		double valor=0;
		
		if((vehiculoResponse.getClaseResponse().getNombre().equals("Motocicleta") && vehiculoResponse.getCilindraje()>125 ) 
				|| (avaluoResponse.getValor()<20000000)) {
			
			valor = avaluoResponse.getValor() *0.015;
		}
		else {
			if(avaluoResponse.getValor()>45000000) {
				valor = avaluoResponse.getValor() * 0.035;
			}
			else {
				valor= avaluoResponse.getValor() * 0.025;
			}
		}
		
		if(vehiculoResponse.getBlindado()=='V' && !vehiculoResponse.getClaseResponse().getNombre().equals("Motocicleta")) {
			valor = valor * 1.1;
		}
		
		LocalDate fecha = LocalDate.now();
		
		if(fecha.getMonthValue()==10 && fecha.getDayOfMonth()<=20) {
	    	valor = valor * 0.9;
	    }
		
		impuesto.setValor(valor);
		impuesto.setPlaca(vehiculoResponse.getPlaca());
		
		Date date = new Date(fecha.getYear()-1900, fecha.getMonthValue()-1, fecha.getDayOfMonth());
		
		impuesto.setFecha(date);
	    
	    impuesto = impuestoRepository.save(impuesto);
		
		ImpuestoResponse impuestoResponse = new ImpuestoResponse(impuesto);
		impuestoResponse.setVehiculoResponse(vehiculoFeignClient.getById(impuesto.getPlaca()));
		
		
		return impuestoResponse;
	}
	
	public ImpuestoResponse getById (Double nro_declaracion) {
		Impuesto impuesto = impuestoRepository.findById(nro_declaracion).get();
		ImpuestoResponse impuestoResponse = new ImpuestoResponse(impuesto);
				
		impuestoResponse.setVehiculoResponse(vehiculoFeignClient.getById(impuesto.getPlaca()));
		
		return impuestoResponse;
	}
}


