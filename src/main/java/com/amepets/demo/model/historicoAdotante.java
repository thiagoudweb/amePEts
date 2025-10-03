package com.amepets.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historico_adotante")
public class historicoAdotante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_adocao")
    private LocalDateTime dataAdocao;

    @Column(name = "nome_animal")
    private String nomeAnimal;

    @Column(name = "tipo_animal")
    private String tipoAnimal;

    @JoinColumn(name = "adotante_id")
    private adotanteEntity adotante;

    @Column(name = "ong_adotante")
    private List<ongAdocao> ongAdotante;

    // Construtor padrão obrigatório para JPA
    public historicoAdotante() {
    }

    public historicoAdotante(LocalDateTime dataAdocao, String nomeAnimal, String tipoAnimal, adotanteEntity adotante) {
        this.dataAdocao = dataAdocao;
        this.nomeAnimal = nomeAnimal;
        this.tipoAnimal = tipoAnimal;
        this.adotante = adotante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDateTime dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public adotanteEntity getAdotante() {
        return adotante;
    }

    public void setAdotante(adotanteEntity adotante) {
        this.adotante = adotante;
    }
}
