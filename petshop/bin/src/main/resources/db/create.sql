CREATE TABLE petshop.servico(
    id text unique PRIMARY KEY NOT NULL,
    tipo text NOT NULL,
    valor real NOT NULL,
    agendamento DATE NOT NULL,
    observacoes text NOT NULL,
    pet_id text NOT NULL,

    CONSTRAINT fk_servico_pet FOREIGN KEY(pet_id) REFERENCES petshop.pet(id)
);