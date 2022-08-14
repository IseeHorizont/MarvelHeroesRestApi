package ru.exercises.marvelheroesrestapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
   JavaBean domain object that represents each character of Marvel Universe
 */

@Entity
@Table(name = "heroes")
@Getter
@Setter
@ToString
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "hero_name")
    private String heroName;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "hometown")
    private String hometown;
    @Column(name = "citizenship")
    private String citizenship;
    @Column(name = "abilities")
    private String abilities;
}
