package br.com.tech4me.petshop.model;

import java.time.LocalDate;

import br.com.tech4me.petshop.shared.ServicoCompletoDTO;
import br.com.tech4me.petshop.shared.ServicoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(schema = "petshop", name = "servico")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Tipo tipo;
    private Double valor;
    private LocalDate agendamento;
    private String observacoes;
    @JoinColumn(name = "pet_id")
    @OneToOne
    private Pet pet;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public LocalDate getAgendamento() {
        return agendamento;
    }
    public void setAgendamento(LocalDate agendamento) {
        this.agendamento = agendamento;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public static Servico fromServicoDTO(ServicoDTO servicoDto){
        var servico = new Servico();
        servico.setId(servicoDto.id());
        servico.setTipo(servicoDto.tipo());
        servico.setAgendamento(servicoDto.agendamento());
        servico.setValor(servicoDto.valor());
        servico.setObservacoes(servicoDto.observacoes());
        return servico;
    }
}
