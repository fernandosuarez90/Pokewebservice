package com.example.suarezpc.pokewebservice.pokeapi;

import com.example.suarezpc.pokewebservice.models.Pokemon;
import com.example.suarezpc.pokewebservice.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by suarezpc on 19/05/17.
 */

public interface    PokeapiService {
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit,@Query("offset") int offset);

    @GET("pokemon/{id}/")
    Call<Pokemon> obtenerPokemon(@Path("id")int id);



}