package com.Daniel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.response.TraccionResponse;
import com.Daniel.service.TraccionService;


@RestController
@RequestMapping("/api/traccion")
public class TraccionController {
	
	@Autowired
	TraccionService traccionService;
	
	
	@GetMapping("getById/{id}")
	public TraccionResponse getById (@PathVariable String id) {
		return traccionService.getById(id);
	}
}
