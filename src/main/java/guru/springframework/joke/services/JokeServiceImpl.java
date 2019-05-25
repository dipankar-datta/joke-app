package guru.springframework.joke.services;

import guru.springframework.joke.data.ChuckNorrisQuotesLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    @Autowired
    private ChuckNorrisQuotesLocal chuckNorrisQuotesLocal;

    @Override
    public String getJoke() {
        return chuckNorrisQuotesLocal.getRandomQuote();
    }
}
