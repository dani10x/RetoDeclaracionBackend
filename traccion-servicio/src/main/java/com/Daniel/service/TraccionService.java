package com.Daniel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.entity.Traccion;
import com.Daniel.repository.TraccionRepository;
import com.Daniel.response.TraccionResponse;


@Service
public class TraccionService {

Logger logger = LoggerFactory.getLogger(TraccionService.class);
	
	@Autowired
	TraccionRepository traccionRepository;
	
	public TraccionResponse getById (String id_traccion) { 
		
		logger.info("Inside getById " + id_traccion);
		
		Traccion traccion = traccionRepository.findById(id_traccion).get();
		
		return new TraccionResponse(traccion);
	}
}
