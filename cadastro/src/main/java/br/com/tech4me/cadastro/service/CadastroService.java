package br.com.tech4me.cadastro.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.cadastro.shared.PetDTO;

public interface CadastroService {
    List<PetDTO> obterPets();
    Optional<PetDTO> obterPorId(String id);
    PetDTO cadastrarPet(PetDTO petDto);
    Optional<PetDTO> atualizarPet(String id, PetDTO petDto);
    void removerPet(String id);
}
