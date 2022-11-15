package com.Daniel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.repository.VehiculoRepository;
import com.Daniel.response.VehiculoResponse;
import com.Daniel.entity.Vehiculo;
import com.Daniel.feingclients.*;



@Service
public class VehiculoService {
	
	@Autowired
	CajaFeingClient cajaFeingClient;
	
	@Autowired
	CarroceriaFeingClient carroceriaFeingClient;
	
	@Autowired
	ClaseFeingClient claseFeingClient;
	
	@Autowired
	CompaniaSoatFeingClient compania_soatFeingClient;
	
	@Autowired
	LineaFeingClient lineaFeingClient;
	
	@Autowired
	MunicipiosFeingClient municipiosFeingClient;
	
	@Autowired
	TraccionFeingClient traccionFeingClient;
	
	@Autowired
	VehiculoRepository vehiculoRepository;
	
	public VehiculoResponse getById (String placa) {
		Vehiculo vehiculo = vehiculoRepository.findById(placa).get();
		VehiculoResponse vehiculoResponse = new VehiculoResponse(vehiculo);
				
		vehiculoResponse.setCajaResponse(cajaFeingClient.getById(vehiculo.getId_caja()));
		vehiculoResponse.setCarroceriaResponse(carroceriaFeingClient.getById(vehiculo.getId_carroceria()));
		vehiculoResponse.setClaseResponse(claseFeingClient.getById(vehiculo.getId_clase()));
		vehiculoResponse.setCompania_soatResponse(compania_soatFeingClient.getById(vehiculo.getCompania_soat_nit()));
		vehiculoResponse.setLineaResponse(lineaFeingClient.getById(vehiculo.getId_linea()));
		vehiculoResponse.setMunicipioResponse(municipiosFeingClient.getById(vehiculo.getId_municipio()));
		vehiculoResponse.setTraccionResponse(traccionFeingClient.getById(vehiculo.getId_traccion()));

		return vehiculoResponse;
	}


	public List<VehiculoResponse> getAll() {
		List<Vehiculo> vehiculos = vehiculoRepository.findAll();
		List<VehiculoResponse> vehiculoResponses = new ArrayList<>();
		
		vehiculos.forEach(vehiculo ->{
			vehiculoResponses.add(new VehiculoResponse(vehiculo));
		});
		
		return vehiculoResponses;
	}
	
}


