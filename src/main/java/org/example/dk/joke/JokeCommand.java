package org.example.dk.joke;

import io.micronaut.configuration.picocli.PicocliRunner;

import jakarta.inject.Inject;
import org.example.dk.joke.api.Joke;
import org.example.dk.joke.api.JokesApiClient;
import picocli.CommandLine.Command;
import static picocli.CommandLine.Help.Ansi;

@Command(name = "joke", description = "Emit random joke from REST API", mixinStandardHelpOptions = true)
public final class JokeCommand implements Runnable {

    @Inject
    JokesApiClient client;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(JokeCommand.class, args);
    }

    public void run() {
        Joke joke;
        //Chuck Norris jokes are always null as returned by this API, so we skip them.
        do {
            joke = client.fetchJoke("random");
        }
        while (joke.getType().contains("Chuck Norris"));

        System.out.println(Ansi.AUTO.string(joke.prettify()));

        //Exits immediatly without a delay imposed by the Netty async execution, which is what Micronaut's HttpClient uses underneith.
        System.exit(0);
    }
}
