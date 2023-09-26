package br.com.tech4me.petshop.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.petshop.shared.PetDTO;

@FeignClient("cadastro")
public interface PetClient {
    @RequestMapping(method = RequestMethod.GET, value = "/pets/{id}")
    PetDTO obterPetPorId(@PathVariable String id);
}
