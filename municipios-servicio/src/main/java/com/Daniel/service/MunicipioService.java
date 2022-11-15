package com.Daniel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Daniel.repository.MunicipioRepository;
import com.Daniel.response.MunicipioResponse;
import com.Daniel.entity.Municipio;
import com.Daniel.feingclients.DepartamentoFeingClient;



@Service
public class MunicipioService {
	
	@Autowired
	DepartamentoFeingClient departamentoFeignClient;
	
	@Autowired
	MunicipioRepository municipioRepository;
	
	public MunicipioResponse getById (String id_municipio) {
		Municipio municipio = municipioRepository.findById(id_municipio).get();
		MunicipioResponse municipioResponse = new MunicipioResponse(municipio);
				
		municipioResponse.setDepartamentoResponse(departamentoFeignClient.getById(municipio.getId_departamento()));
		
		return municipioResponse;
	}
	
}


