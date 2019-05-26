package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckNorrisConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
