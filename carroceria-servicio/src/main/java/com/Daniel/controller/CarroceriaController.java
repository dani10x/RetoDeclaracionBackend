package com.Daniel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.response.CarroceriaResponse;
import com.Daniel.service.CarroceriaService;


@RestController
@RequestMapping("/api/carroceria")
public class CarroceriaController {
	
	@Autowired
	CarroceriaService carroceriaService;
	
	
	@GetMapping("getById/{id}")
	public CarroceriaResponse getById (@PathVariable String id) {
		return carroceriaService.getById(id);
	}
}