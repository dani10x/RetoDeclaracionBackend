package com.Daniel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.entity.Carroceria;
import com.Daniel.repository.CarroceriaRepository;
import com.Daniel.response.CarroceriaResponse;


@Service
public class CarroceriaService {

Logger logger = LoggerFactory.getLogger(CarroceriaService.class);
	
	@Autowired
	CarroceriaRepository carroceriaRepository;
	
	public CarroceriaResponse getById (String id) { 
		
		logger.info("Inside getById " + id);
		
		Carroceria carroceria = carroceriaRepository.findById(id).get();
		
		return new CarroceriaResponse(carroceria);
	}
}
