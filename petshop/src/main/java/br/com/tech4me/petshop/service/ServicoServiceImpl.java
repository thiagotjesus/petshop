package br.com.tech4me.petshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.petshop.httpClient.PetClient;
import br.com.tech4me.petshop.model.Pet;
import br.com.tech4me.petshop.model.Servico;
import br.com.tech4me.petshop.repository.ServicoRepository;
import br.com.tech4me.petshop.shared.PetDTO;
import br.com.tech4me.petshop.shared.ServicoCompletoDTO;
import br.com.tech4me.petshop.shared.ServicoDTO;

@Service
public class ServicoServiceImpl implements ServicoService{
    @Autowired
    private ServicoRepository repositorio;
    
    @Autowired
    private PetClient petClient;

    @Override
    public Optional<ServicoDTO> obterServicoPorId(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterServicoPorId'");
    }

    @Override
    public ServicoCompletoDTO cadastrarServico(ServicoDTO servicoDto) {
        Servico servico = Servico.fromServicoDTO(servicoDto);
        PetDTO petDto = petClient.obterPetPorId(servicoDto.petId());
        servico.setPet(Pet.from(petDto));
        repositorio.save(servico);
        return ServicoCompletoDTO.from(servico);
    }

    
}   
