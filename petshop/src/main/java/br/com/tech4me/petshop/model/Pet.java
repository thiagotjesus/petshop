package br.com.tech4me.petshop.model;

import br.com.tech4me.petshop.shared.PetDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "petshop", name = "pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private String raca;
    private Integer idade;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

        public static Pet from(PetDTO petDto){
        Pet pet = new Pet();
        pet.setId(petDto.id());
        pet.setNome(petDto.nome());
        pet.setRaca(petDto.raca());     
        pet.setIdade(petDto.idade());
        return pet;
    }
}
