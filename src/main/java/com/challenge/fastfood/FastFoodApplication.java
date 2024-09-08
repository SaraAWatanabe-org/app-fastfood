package com.challenge.fastfood;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "FastFood", version = "1.0.0", description = ""))
@SpringBootApplication
public class FastFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastFoodApplication.class, args);
	}

}
