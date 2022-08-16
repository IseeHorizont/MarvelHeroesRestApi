package ru.exercises.marvelheroesrestapi.rest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import ru.exercises.marvelheroesrestapi.model.Hero;
import ru.exercises.marvelheroesrestapi.service.HeroService;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class HeroRestControllerV1Test {
    private static final Long ID = 1L;

    @Mock
    private HeroService heroService;

    @InjectMocks
    private HeroRestControllerV1 heroRestControllerV1;

    @Test
    public void getById() {
        final Hero hero = mock(Hero.class);
        when(heroService.getById(ID)).thenReturn(Optional.ofNullable(hero));

        final Optional<Hero> actualHero = heroService.getById(ID);

        Assertions.assertEquals(Optional.ofNullable(hero), actualHero);
        verify(heroService).getById(ID);
    }

    @Test
    public void save() {
        final Hero hero = mock(Hero.class);

        heroRestControllerV1.saveHero(hero);

        verify(heroService).save(hero);
    }
}
