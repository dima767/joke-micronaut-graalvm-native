package org.example.dk.joke.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.Data;

@Introspected
@Data
public class Joke {

    private int status;

    private String type;

    @JsonProperty("joke")
    private String text;
}
