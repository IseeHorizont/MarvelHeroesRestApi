package ru.exercises.marvelheroesrestapi.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.exercises.marvelheroesrestapi.model.Hero;
import ru.exercises.marvelheroesrestapi.service.HeroService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/heroes/")
@Slf4j
public class HeroRestControllerV1 {

    @Autowired
    private HeroService heroService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Hero>> getHero(@PathVariable("id") Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Optional<Hero> hero = this.heroService.getById(id);
        log.info("HeroRestControllerV1 We got hero {}", hero);
        if (hero.isPresent()) {
            return new ResponseEntity<>(hero, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Hero>> getAll() {
        List<Hero> heroesList = this.heroService.getAll();
        if (heroesList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(heroesList, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Hero> saveHero(@RequestBody Hero hero) {
        HttpHeaders header = new HttpHeaders();
        if (hero == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        this.heroService.save(hero);
        log.info("HeroRestControllerV1 Hero: {} saved", hero);
        return new ResponseEntity<>(hero, header, HttpStatus.CREATED);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Hero> updateHero(@RequestBody Hero hero, UriComponentsBuilder uriComponentsBuilder) {
        HttpHeaders header = new HttpHeaders();
        if (hero == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        this.heroService.save(hero);
        log.info("HeroRestControllerV1 Hero: {} updated", hero);
        return new ResponseEntity<>(hero, header, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Hero> deleteHero(@PathVariable("id") Long id) {
        Optional<Hero> hero = this.heroService.getById(id);
        if (!hero.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        this.heroService.delete(id);
        log.info("HeroRestControllerV1 We removed hero with ID{}", id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
