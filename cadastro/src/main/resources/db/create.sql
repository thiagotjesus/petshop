/* CREATE DATABASE tech4pets;

CREATE SCHEMA petshop; */

CREATE TABLE petshop.pet(
    id text UNIQUE PRIMARY KEY NOT NULL, 
    nome text NOT NULL,
    raca text NOT NULL,
    idade SMALLINT NOT NULL
);