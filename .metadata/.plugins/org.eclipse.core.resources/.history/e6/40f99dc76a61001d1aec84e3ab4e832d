package com.Daniel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.request.CreateImpuestoRequest;
import com.Daniel.response.ImpuestoResponse;
import com.Daniel.service.ImpuestoService;


@RestController
@RequestMapping("/api/impuesto")
public class ImpuestoController {
	
	@Autowired
	ImpuestoService impuestoService;
	
	
	@GetMapping("getById/{id}")
	public ImpuestoResponse getById (@PathVariable Double id) {
		return impuestoService.getById(id);
	}
	
	@PostMapping("/create")
	public ImpuestoResponse createStudent (@RequestBody CreateImpuestoRequest createImpuestoRequest) {
		return impuestoService.CreateImpuesto(createImpuestoRequest);
	}
}
