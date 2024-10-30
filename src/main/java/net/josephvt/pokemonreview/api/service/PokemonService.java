package net.josephvt.pokemonreview.api.service;

import net.josephvt.pokemonreview.api.dto.PokemonDto;

import java.util.List;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
    List<PokemonDto> getAllPokemons();
    PokemonDto getPokemonById(int id);
    PokemonDto updatePokemon(PokemonDto pokemonDto, int id);
}
