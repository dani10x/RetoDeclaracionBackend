package com.Daniel.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Daniel.response.CarroceriaResponse;

@FeignClient(url = "${carroceria.servicio.url}", value = "carroceria-feign-client", path = "/api/carroceria")
public interface CarroceriaFeingClient {

	@GetMapping("/getById/{id}")
	public CarroceriaResponse getById(@PathVariable String id);
}
