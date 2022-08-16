package ru.exercises.marvelheroesrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MarvelHeroesRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarvelHeroesRestApiApplication.class, args);
    }

}
