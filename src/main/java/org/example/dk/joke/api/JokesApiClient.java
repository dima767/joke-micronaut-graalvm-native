package org.example.dk.joke.api;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;

@Client("${jokes.api.url}")
public interface JokesApiClient {

    @Get("/")
    Joke fetchJoke(@QueryValue("type") String type);

}
