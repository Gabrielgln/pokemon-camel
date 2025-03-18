package com.lira.pokemon_camel.adapters.outbound.service;

import com.lira.pokemon_camel.domain.model.PokemonResponseList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "pokemon-service", url = "https://pokeapi.co/api/v2")
public interface PokemonServiceClient {
    @GetMapping("/pokemon-species")
    PokemonResponseList getAllPokemons();
}
