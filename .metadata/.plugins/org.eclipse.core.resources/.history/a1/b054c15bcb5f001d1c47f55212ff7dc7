package com.Daniel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.entity.Caja;
import com.Daniel.repository.CajaRepository;
import com.Daniel.request.CreateCajaRequest;
import com.Daniel.response.CajaResponse;

@Service
public class CajaService {

	Logger logger = LoggerFactory.getLogger(CajaService.class);
	
	@Autowired
	CajaRepository cajaRepository;
	
	public CajaResponse createCaja(CreateCajaRequest createCajaRequest) {
		Caja caja = new Caja();
		caja.setNombre(createCajaRequest.getName());
		
		cajaRepository.save(caja);
		
		return new CajaResponse(caja);
	}
	
	public CajaResponse getById (String id) {
		
		logger.info("Inside getById " + id);
		
		Caja caja = cajaRepository.findById(id).get();
		
		return new CajaResponse(caja);
	}
	
}
