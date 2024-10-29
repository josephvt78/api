package net.josephvt.pokemonreview.api.service;

import net.josephvt.pokemonreview.api.dto.PokemonDto;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
}
