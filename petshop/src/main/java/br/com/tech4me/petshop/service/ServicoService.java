package br.com.tech4me.petshop.service;

import java.util.Optional;

<<<<<<< HEAD
import br.com.tech4me.petshop.shared.ServicoCompletoDTO;
=======
>>>>>>> 9054204eb7766ca8daf4f9fee20f570bde968542
import br.com.tech4me.petshop.shared.ServicoDTO;

public interface ServicoService {
    Optional<ServicoDTO> obterServicoPorId(String id);
<<<<<<< HEAD
    ServicoCompletoDTO cadastrarServico(ServicoDTO servicoDto);
=======
    ServicoDTO cadastrarServico(ServicoDTO servicoDto);
>>>>>>> 9054204eb7766ca8daf4f9fee20f570bde968542
}
