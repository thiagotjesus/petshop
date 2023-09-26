package br.com.tech4me.cadastro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.cadastro.model.Pet;
import br.com.tech4me.cadastro.repository.PetRepository;
import br.com.tech4me.cadastro.shared.PetDTO;

@Service
public class CadastroServiceImpl implements CadastroService{

    @Autowired
    private PetRepository repositorio;

    @Override
    public List<PetDTO> obterPets() {
        return repositorio.findAll().stream()
        .map(p -> PetDTO.from(p))
        .toList();
    }

    @Override
    public Optional<PetDTO> obterPorId(String id) {
        var pet = repositorio.findById(id);
     
        return repositorio.findById(id).isPresent() ? Optional.of(PetDTO.from(pet.get())) : Optional.empty();

    }

    @Override
    public PetDTO cadastrarPet(PetDTO petDto) {
        var pet = Pet.from(petDto);
        repositorio.save(pet);
        return PetDTO.from(pet);
    }

    @Override
    public Optional<PetDTO> atualizarPet(String id, PetDTO petDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPet'");
    }

    @Override
    public void removerPet(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerPet'");
    }
    
}
