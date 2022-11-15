package com.Daniel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.entity.Marca;
import com.Daniel.repository.MarcaRepository;
import com.Daniel.response.MarcaResponse;


@Service
public class MarcaService {

Logger logger = LoggerFactory.getLogger(MarcaService.class);
	
	@Autowired
	MarcaRepository marcaRepository;
	
	public MarcaResponse getById (String id_marca) { 
		
		logger.info("Inside getById " + id_marca);
		
		Marca marca = marcaRepository.findById(id_marca).get();
		
		return new MarcaResponse(marca);
	}
}
