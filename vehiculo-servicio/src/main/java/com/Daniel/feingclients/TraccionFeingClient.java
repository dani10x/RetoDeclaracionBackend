package com.Daniel.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Daniel.response.TraccionResponse;

@FeignClient(url = "${traccion.servicio.url}", value = "traccion-feign-client", path = "/api/traccion")
public interface TraccionFeingClient {

	@GetMapping("/getById/{id}")
	public TraccionResponse getById(@PathVariable String id);
}
