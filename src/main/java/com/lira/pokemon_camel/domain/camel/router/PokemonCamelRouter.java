package com.lira.pokemon_camel.domain.camel.router;

import com.lira.pokemon_camel.adapters.outbound.service.PokemonServiceClient;
import com.lira.pokemon_camel.domain.camel.processor.GetAllResponseProcessor;
import lombok.RequiredArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import static com.lira.pokemon_camel.domain.common.constant.CamelExchangeRouterURIConstant.DIRECT_SERVICE_GET_ALL_POKEMONS;

@Component
@RequiredArgsConstructor
public class PokemonCamelRouter extends RouteBuilder {
    private final PokemonServiceClient client;

    @Override
    public void configure() throws Exception {
        from(DIRECT_SERVICE_GET_ALL_POKEMONS)
                .bean(client, "getAllPokemons")
                .process(new GetAllResponseProcessor())
                .end();
    }
}
