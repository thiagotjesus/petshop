package br.com.tech4me.petshop.service;

import java.util.Optional;

import br.com.tech4me.petshop.shared.ServicoCompletoDTO;
import br.com.tech4me.petshop.shared.ServicoDTO;

public interface ServicoService {
    Optional<ServicoDTO> obterServicoPorId(String id);
    ServicoCompletoDTO cadastrarServico(ServicoDTO servicoDto);
}
