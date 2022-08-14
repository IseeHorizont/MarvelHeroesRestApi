package ru.exercises.marvelheroesrestapi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.exercises.marvelheroesrestapi.model.Hero;
import ru.exercises.marvelheroesrestapi.repository.HeroRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class HeroServiceImpl implements HeroService {

    @Autowired
    private HeroRepository heroRepository;

    @Override
    public Optional<Hero> getById(Long heroId) {
        log.info("IN HeroServiceImpl getById we get ID{}", heroId);
        return heroRepository.findById(heroId);
    }

    @Override
    public List<Hero> getAll() {
        log.info("IN HeroServiceImpl getAll");
        return heroRepository.findAll();
    }

    @Override
    public void save(Hero hero) {
        log.info("IN HeroServiceImpl we save {}", hero);
        heroRepository.save(hero);
    }

    @Override
    public void delete(Long heroId) {
        log.info("IN HeroServiceImpl we remove with ID{}", heroId);
        heroRepository.deleteById(heroId);
    }
}
