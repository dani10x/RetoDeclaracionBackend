package com.Daniel.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Daniel.response.DepartamentoResponse;

@FeignClient(url = "${departamento.servicio.url}", value = "departamento-feign-client", path = "/api/departamento")
public interface DepartamentoFeingClient {
	
	@GetMapping("/getById/{id}")
	public DepartamentoResponse getById(@PathVariable String id);
}
