package com.amepets.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "endereco_historico")
public class HistoricoAdocaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "adotante_id")
    private AdotanteEntity adotante;



}
