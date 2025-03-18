package com.lira.pokemon_camel.adapters.inbound.controller;

import com.lira.pokemon_camel.application.service.PokemonCamelService;
import com.lira.pokemon_camel.domain.model.PokemonResponseList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemons")
@RequiredArgsConstructor
public class PokemonCamelController {
    private final PokemonCamelService service;

    @GetMapping
    public ResponseEntity<PokemonResponseList> getAll(){
        return ResponseEntity.ok(this.service.getAll());
    }
}
