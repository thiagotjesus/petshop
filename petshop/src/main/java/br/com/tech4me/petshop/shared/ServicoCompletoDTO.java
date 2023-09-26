package br.com.tech4me.petshop.shared;

import java.time.LocalDate;

import br.com.tech4me.petshop.model.Pet;
import br.com.tech4me.petshop.model.Servico;
import br.com.tech4me.petshop.model.Tipo;

public record ServicoCompletoDTO (String id,
    Tipo tipo,
    Double valor,
    LocalDate agendamento,
    String observacoes,
    Pet petId){
    
    public static ServicoCompletoDTO from(Servico servico){
        return new ServicoCompletoDTO(servico.getId(),
        servico.getTipo(),
        servico.getValor(),
        servico.getAgendamento(),
        servico.getObservacoes(),
        servico.getPet());
    }
}