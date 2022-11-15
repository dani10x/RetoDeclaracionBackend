package com.Daniel.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Daniel.response.ClaseResponse;


@FeignClient(url = "${clase.servicio.url}", value = "clase-feign-client", path = "/api/clase")
public interface ClaseFeingClient {
	
	@GetMapping("/getById/{id}")
	public ClaseResponse getById(@PathVariable String id);
}
