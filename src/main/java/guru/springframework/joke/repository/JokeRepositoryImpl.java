package guru.springframework.joke.repository;

import guru.springframework.joke.data.ChuckNorrisQuotesLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JokeRepositoryImpl implements JokeRepository {

    private final ChuckNorrisQuotesLocal chuckNorrisQuotesLocal;

    @Autowired
    public JokeRepositoryImpl(ChuckNorrisQuotesLocal chuckNorrisQuotesLocal) {
        this.chuckNorrisQuotesLocal = chuckNorrisQuotesLocal;
    }

    @Override
    public String getJoke() {
        return null;
    }
}
