CREATE TABLE heroes (
    id BIGSERIAL UNIQUE PRIMARY KEY,
    hero_name VARCHAR(100) NOT NULL,
    real_name VARCHAR(100) NOT NULL,
    hometown VARCHAR(100) NOT NULL,
    citizenship VARCHAR(100) NOT NULL,
    abilities VARCHAR(300) NOT NULL
);