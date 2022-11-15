package com.Daniel.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Daniel.response.VehiculoResponse;

@FeignClient(url = "${vehiculo.servicio.url}", value = "vehiculo-feign-client", path = "/api/vehiculo")
public interface VehiculoFeingClient {
	
	@GetMapping("/getById/{id}")
	public VehiculoResponse getById(@PathVariable String id);
}
