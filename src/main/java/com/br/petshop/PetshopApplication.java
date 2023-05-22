package com.br.petshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class PetshopApplication {

	public static void main(String[] args) {

		SpringApplication.run(PetshopApplication.class, args);
	}

}
