package com.hari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@ImportRuntimeHints(ResourceRuntimeHints.class)
@SpringBootApplication
public class JteProductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JteProductionApplication.class, args);
	}

}
