package com.Daniel.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.Daniel.controller", "com.Daniel.service"})
@EntityScan("com.Daniel.entity")
@EnableJpaRepositories("com.Daniel.repository")
public class TraccionServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraccionServicioApplication.class, args);
	}

}
