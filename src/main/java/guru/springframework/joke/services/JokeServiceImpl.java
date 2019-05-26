package guru.springframework.joke.services;

import guru.springframework.joke.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    @Autowired
    private JokeRepository jokeRepository;

    @Override
    public String getJoke() {
        return jokeRepository.getJoke();
    }
}
