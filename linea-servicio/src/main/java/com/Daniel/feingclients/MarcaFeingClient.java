package com.Daniel.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Daniel.response.MarcaResponse;

@FeignClient(url = "${marca.servicio.url}", value = "marca-feign-client", path = "/api/marca")
public interface MarcaFeingClient {
	
	@GetMapping("/getById/{id}")
	public MarcaResponse getById(@PathVariable String id);
}
