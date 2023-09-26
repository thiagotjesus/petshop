package br.com.tech4me.petshop.shared;

import br.com.tech4me.petshop.model.Pet;

public record PetDTO(String id, String nome, String raca, Integer idade) {

    public static PetDTO from(Pet pet){
        return new PetDTO(pet.getId(), pet.getNome(), pet.getRaca(), pet.getIdade());
    }
}
