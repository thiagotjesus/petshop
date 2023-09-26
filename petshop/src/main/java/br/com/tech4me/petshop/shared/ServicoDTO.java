package br.com.tech4me.petshop.shared;

import java.time.LocalDate;

import br.com.tech4me.petshop.model.Servico;
import br.com.tech4me.petshop.model.Tipo;

public record ServicoDTO(
    String id,
    Tipo tipo,
    Double valor,
    String agendamento,
    String observacoes,
    String petId){
    
    public static ServicoDTO from(Servico servico){
        return new ServicoDTO(servico.getId(),
        servico.getTipo(),
        servico.getValor(),
        servico.getAgendamento().toString(),
        servico.getObservacoes(),
        servico.getPet().getId());
    }
}

