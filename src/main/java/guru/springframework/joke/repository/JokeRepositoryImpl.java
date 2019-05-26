package guru.springframework.joke.repository;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JokeRepositoryImpl implements JokeRepository {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public JokeRepositoryImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return null;
    }
}
