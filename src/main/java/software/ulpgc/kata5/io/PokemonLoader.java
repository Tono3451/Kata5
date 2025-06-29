package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.Pokemon;

public interface PokemonLoader {
    Pokemon load(String pokemon);
}
