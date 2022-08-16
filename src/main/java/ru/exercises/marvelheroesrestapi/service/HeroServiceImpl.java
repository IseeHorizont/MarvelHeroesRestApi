package ru.exercises.marvelheroesrestapi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
    @Cacheable(cacheNames = "heroCache", key = "#heroId")
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
    @CachePut(cacheNames = "heroCache", key = "#hero.id")
    public void save(Hero hero) {
        log.info("IN HeroServiceImpl we save {}", hero);
        heroRepository.save(hero);
        // we need to return object 'hero' for caching
    }

    @Override
    @CacheEvict(cacheNames = "heroCache", key = "#heroId")
    public void delete(Long heroId) {
        log.info("IN HeroServiceImpl we remove with ID{}", heroId);
        heroRepository.deleteById(heroId);
        // we need to return object 'hero' for caching
    }
}
