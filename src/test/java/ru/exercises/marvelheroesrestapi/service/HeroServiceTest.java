package ru.exercises.marvelheroesrestapi.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.exercises.marvelheroesrestapi.model.Hero;
import ru.exercises.marvelheroesrestapi.repository.HeroRepository;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class HeroServiceTest {
    private static final Long ID = 1L;

    @Mock
    private HeroRepository heroRepository;

    @InjectMocks
    private HeroServiceImpl service;

    @Test
    public void getById_shouldCallRepository() {
        final Hero hero = mock(Hero.class);
        when(heroRepository.findById(ID)).thenReturn(Optional.ofNullable(hero));

        final Optional<Hero> actualHero = service.getById(ID);

        Assertions.assertEquals(Optional.ofNullable(hero), actualHero);
        verify(heroRepository).findById(ID);
    }

    @Test
    public void save_shouldCallRepository() {
        final Hero hero = mock(Hero.class);
        service.save(hero);
        verify(heroRepository).save(hero);
    }
}
