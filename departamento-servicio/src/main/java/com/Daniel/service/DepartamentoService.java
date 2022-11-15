package com.Daniel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.entity.Departamento;
import com.Daniel.repository.DepartamentoRepository;
import com.Daniel.response.DepartamentoResponse;


@Service
public class DepartamentoService {

Logger logger = LoggerFactory.getLogger(DepartamentoService.class);
	
	@Autowired
	DepartamentoRepository departamentoRepository;
	
	public DepartamentoResponse getById (String id_departamento) { 
		
		logger.info("Inside getById " + id_departamento);
		
		Departamento departamento = departamentoRepository.findById(id_departamento).get();
		
		return new DepartamentoResponse(departamento);
	}
}
