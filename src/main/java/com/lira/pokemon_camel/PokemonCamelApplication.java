package com.lira.pokemon_camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PokemonCamelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonCamelApplication.class, args);
	}

}
