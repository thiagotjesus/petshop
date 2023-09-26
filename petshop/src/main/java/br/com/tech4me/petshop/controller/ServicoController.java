package br.com.tech4me.petshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.petshop.service.ServicoService;
import br.com.tech4me.petshop.shared.ServicoCompletoDTO;
import br.com.tech4me.petshop.shared.ServicoDTO;

@RequestMapping("/servico")
@RestController
public class ServicoController {
    @Autowired
    ServicoService servico;
    
    @PostMapping
    public ResponseEntity<ServicoCompletoDTO> cadastrar(@RequestBody ServicoDTO servicoDto){
       return new ResponseEntity<>(servico.cadastrarServico(servicoDto), HttpStatus.CREATED); 
    }
}
