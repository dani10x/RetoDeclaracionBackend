package com.Daniel.feingclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Daniel.response.Compania_soatResponse;

@FeignClient(url = "${companiasSoat.servicio.url}", value = "companiaSoat-feign-client", path = "/api/compania_soat")
public interface CompaniaSoatFeingClient {

	@GetMapping("/getById/{id}")
	public Compania_soatResponse getById(@PathVariable String id);
}
