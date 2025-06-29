package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.ApiPokemon;
import software.ulpgc.kata5.model.Pokemon;

public interface PokemonAdapter {
    Pokemon adapt(ApiPokemon apiPokemon);
}
