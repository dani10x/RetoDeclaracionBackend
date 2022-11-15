package com.Daniel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.response.Compania_soatResponse;
import com.Daniel.service.Compania_soatService;


@RestController
@RequestMapping("/api/compania_soat")
public class Compania_soatController {
	
	@Autowired
	Compania_soatService compania_soatService;
	
	
	@GetMapping("getById/{id}")
	public Compania_soatResponse getById (@PathVariable String id) {
		return compania_soatService.getById(id);
	}
}
