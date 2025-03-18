package com.lira.pokemon_camel.application.service;

import com.lira.pokemon_camel.domain.model.PokemonResponseList;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.lira.pokemon_camel.domain.common.constant.CamelExchangeRouterURIConstant.DIRECT_SERVICE_GET_ALL_POKEMONS;

@Service
public class PokemonCamelService {
    @Autowired
    private ProducerTemplate template;

    public PokemonResponseList getAll(){
        return this.template.requestBody(DIRECT_SERVICE_GET_ALL_POKEMONS, null, PokemonResponseList.class);
    }
}
