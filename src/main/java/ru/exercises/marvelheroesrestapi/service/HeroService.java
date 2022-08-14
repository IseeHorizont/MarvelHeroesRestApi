package ru.exercises.marvelheroesrestapi.service;

import ru.exercises.marvelheroesrestapi.model.Hero;

import java.util.List;
import java.util.Optional;

public interface HeroService {

    Optional<Hero> getById(Long heroId);

    List<Hero> getAll();

    void save(Hero hero);

    void delete(Long heroId);
}
