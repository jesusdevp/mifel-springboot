package com.mifel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class PokemonController {

    private final WebClient webClient = WebClient.create();

    @GetMapping("/api/pokemon")
    public ResponseEntity<String> obtenerPokemon() {
        String response = webClient.get()
                .uri("https://pokeapi.co/api/v2/pokemon/ditto")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        return ResponseEntity.ok(response);
    }
}