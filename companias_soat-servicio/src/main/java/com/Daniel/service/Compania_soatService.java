package com.Daniel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.entity.Companias_soat;
import com.Daniel.repository.Compania_soatRepository;
import com.Daniel.response.Compania_soatResponse;


@Service
public class Compania_soatService {

Logger logger = LoggerFactory.getLogger(Compania_soatService.class);
	
	@Autowired
	Compania_soatRepository companiaRepository;
	
	public Compania_soatResponse getById (String nit) { 
		
		logger.info("Inside getById " + nit);
		
		Companias_soat compania = companiaRepository.findById(nit).get();
		
		return new Compania_soatResponse(compania);
	}
}
