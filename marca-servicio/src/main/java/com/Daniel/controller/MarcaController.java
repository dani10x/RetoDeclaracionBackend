package com.Daniel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.response.MarcaResponse;
import com.Daniel.service.MarcaService;


@RestController
@RequestMapping("/api/marca")
public class MarcaController {
	
	@Autowired
	MarcaService marcaService;
	
	
	@GetMapping("getById/{id}")
	public MarcaResponse getById (@PathVariable String id) {
		return marcaService.getById(id);
	}
}
