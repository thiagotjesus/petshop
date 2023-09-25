package br.com.tech4me.cadastro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.cadastro.service.CadastroService;
import br.com.tech4me.cadastro.shared.PetDTO;

@RestController
@RequestMapping("/pets")
public class CadastroController {
    @Autowired
    private CadastroService servico;

    @GetMapping
    public ResponseEntity<List<PetDTO>> obterPets(){
        return new ResponseEntity<>(servico.obterPets(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PetDTO> obterPetPorId(@PathVariable String id){
        Optional<PetDTO> petDto = servico.obterPorId(id);
        
        if (petDto.isPresent()) {
            return new ResponseEntity<>(petDto.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<PetDTO> cadastrarPet(@RequestBody PetDTO petDto){
        return new ResponseEntity<>(servico.cadastrarPet(petDto), HttpStatus.CREATED);
    }
}
