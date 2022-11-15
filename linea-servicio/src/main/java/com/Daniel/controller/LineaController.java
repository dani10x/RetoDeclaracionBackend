package com.Daniel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.response.LineaResponse;
import com.Daniel.service.LineaService;


@RestController
@RequestMapping("/api/linea")
public class LineaController {
	
	@Autowired
	LineaService lineaService;
	
	
	@GetMapping("getById/{id}")
	public LineaResponse getById (@PathVariable String id) {
		return lineaService.getById(id);
	}
}
