package com.Daniel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.response.ClaseResponse;
import com.Daniel.service.ClaseService;


@RestController
@RequestMapping("/api/clase")
public class ClaseController {
	
	@Autowired
	ClaseService claseService;
	
	
	@GetMapping("getById/{id}")
	public ClaseResponse getById (@PathVariable String id) {
		return claseService.getById(id);
	}
}
