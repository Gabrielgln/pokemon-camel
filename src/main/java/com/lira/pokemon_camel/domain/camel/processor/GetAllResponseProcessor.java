package com.lira.pokemon_camel.domain.camel.processor;

import com.lira.pokemon_camel.domain.model.PokemonResponseList;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class GetAllResponseProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        var response = exchange.getIn().getBody(PokemonResponseList.class);
        exchange.getIn().setBody(response);
    }
}
