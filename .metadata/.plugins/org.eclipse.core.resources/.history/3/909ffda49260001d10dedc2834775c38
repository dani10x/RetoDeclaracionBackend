package com.Daniel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.response.MunicipioResponse;
import com.Daniel.service.MunicipioService;


@RestController
@RequestMapping("/api/municipio")
public class MunicipioController {
	
	@Autowired
	MunicipioService municipioService;
	
	
	@GetMapping("getById/{id}")
	public MunicipioResponse getById (@PathVariable String id) {
		return municipioService.getById(id);
	}
}
