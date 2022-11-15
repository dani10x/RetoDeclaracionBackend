package com.Daniel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.response.DepartamentoResponse;
import com.Daniel.service.DepartamentoService;


@RestController
@RequestMapping("/api/departamento")
public class DepartamentoController {
	
	@Autowired
	DepartamentoService departamentoService;
	
	
	@GetMapping("getById/{id}")
	public DepartamentoResponse getById (@PathVariable String id) {
		return departamentoService.getById(id);
	}
}
