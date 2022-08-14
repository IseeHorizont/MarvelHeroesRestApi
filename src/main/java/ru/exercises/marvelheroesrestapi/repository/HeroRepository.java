package ru.exercises.marvelheroesrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.exercises.marvelheroesrestapi.model.Hero;

/**
 * Repository for {@link Hero} class.
 */
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
