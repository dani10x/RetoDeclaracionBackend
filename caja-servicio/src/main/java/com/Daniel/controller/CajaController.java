package com.Daniel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.request.CreateCajaRequest;
import com.Daniel.response.CajaResponse;
import com.Daniel.service.CajaService;

@RestController
@RequestMapping("/api/caja")
public class CajaController {
	
	@Autowired
	CajaService cajaService;
	
	
	@PostMapping("/create")
	public CajaResponse createCaja (@RequestBody CreateCajaRequest createCajaRequest) {
		return cajaService.createCaja(createCajaRequest);
	}
	
	@GetMapping("getById/{id}")
	public CajaResponse getById (@PathVariable String id) {
		return cajaService.getById(id);
	}
}
