package com.Daniel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.entity.Clase;
import com.Daniel.repository.ClaseRepository;
import com.Daniel.response.ClaseResponse;


@Service
public class ClaseService {

Logger logger = LoggerFactory.getLogger(ClaseService.class);
	
	@Autowired
	ClaseRepository claseRepository;
	
	public ClaseResponse getById (String id) { 
		
		logger.info("Inside getById " + id);
		
		Clase clase = claseRepository.findById(id).get();
		
		return new ClaseResponse(clase);
	}
}
