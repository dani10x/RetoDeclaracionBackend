package com.Daniel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.repository.AvaluoRepository;
import com.Daniel.response.AvaluoResponse;
import com.Daniel.entity.Avaluo;
import com.Daniel.feingclients.ClaseFeingClient;
import com.Daniel.feingclients.LineaFeingClient;



@Service
public class AvaluoService {
	
	@Autowired
	ClaseFeingClient claseFeignClient;
	
	@Autowired
	LineaFeingClient lineaFeingClient;
	
	@Autowired
	AvaluoRepository avaluoRepository;
	
	public AvaluoResponse getById (String id_avaluo) {
		Avaluo avaluo = avaluoRepository.findById(id_avaluo).get();
		AvaluoResponse avaluoResponse = new AvaluoResponse(avaluo);
				
		avaluoResponse.setClaseResponse(claseFeignClient.getById(avaluo.getId_clase()));
		avaluoResponse.setLineaResponse(lineaFeingClient.getById(avaluo.getId_linea()));
		
		return avaluoResponse;
	}
	
	public AvaluoResponse getAvaluo(String clase, int modelo, int cc, String linea) {
		List<Avaluo> avaluos = avaluoRepository.findAvaluo(clase, modelo, cc, linea);
		AvaluoResponse avaluoResponse = new AvaluoResponse(avaluos.get(0));
		
		avaluoResponse.setClaseResponse(claseFeignClient.getById(avaluos.get(0).getId_clase()));
		avaluoResponse.setLineaResponse(lineaFeingClient.getById(avaluos.get(0).getId_linea()));
		
		return avaluoResponse;
		
	}
	
}


