package com.Daniel.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Daniel.response.VehiculoResponse;
import com.Daniel.service.VehiculoService;


@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {
	
	@Autowired
	VehiculoService vehiculoService;
	
	
	@GetMapping("getById/{id}")
	public VehiculoResponse getById (@PathVariable String id) {
		return vehiculoService.getById(id);
	}
	
	@GetMapping("getAll")
	public List<VehiculoResponse> getAll(){
		return vehiculoService.getAll();
	}
}
