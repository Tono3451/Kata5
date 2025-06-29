package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.ApiPokemon;

public interface PokemonDeserializer {
    ApiPokemon deserialize(String json);
}
