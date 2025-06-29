package software.ulpgc.kata5.io;

import com.google.gson.Gson;
import software.ulpgc.kata5.model.ApiPokemon;

public class ApiPokemonDeserializer implements PokemonDeserializer{
    @Override
    public ApiPokemon deserialize(String json) {
        return new Gson().fromJson(json, ApiPokemon.class);
    }
}
