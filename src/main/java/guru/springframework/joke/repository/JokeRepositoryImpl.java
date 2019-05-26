package guru.springframework.joke.repository;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Repository;

@Repository
public class JokeRepositoryImpl implements JokeRepository {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeRepositoryImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
