package br.com.tech4me.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tech4me.petshop.model.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, String>{
    
}
