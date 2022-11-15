package com.Daniel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.repository.LineaRepository;
import com.Daniel.response.LineaResponse;
import com.Daniel.entity.Linea;
import com.Daniel.feingclients.MarcaFeingClient;



@Service
public class LineaService {
	
	@Autowired
	MarcaFeingClient marcaFeignClient;
	
	@Autowired
	LineaRepository lineaRepository;
	
	public LineaResponse getById (String id_linea) {
		Linea linea = lineaRepository.findById(id_linea).get();
		LineaResponse lineaResponse = new LineaResponse(linea);
				
		lineaResponse.setMarcaResponse(marcaFeignClient.getById(linea.getId_marca()));
		
		return lineaResponse;
	}
	
}


