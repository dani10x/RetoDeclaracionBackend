package com.Daniel.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Daniel.response.LineaResponse;

@FeignClient(url = "${linea.servicio.url}", value = "linea-feign-client", path = "/api/linea")
public interface LineaFeingClient {
	
	@GetMapping("/getById/{id}")
	public LineaResponse getById(@PathVariable String id);

}
