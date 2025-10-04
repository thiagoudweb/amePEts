package com.amepets.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "endereco_table")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
