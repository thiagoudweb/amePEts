package com.amepets.demo.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "adotante")
public class adotanteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "cpf", unique = true)
    private String cpf;

    @Column(name = "telefone", unique = true)
    private String telefone;

    @OneToMany(mappedBy = "adotante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<historicoAdotante> historicoAdocoes;
    
    public adotanteEntity() {
    }

    public adotanteEntity(List<historicoAdotante> historicoAdocoes, String telefone, String cpf, String senha, String email, String nome, Long id) {
        this.historicoAdocoes = historicoAdocoes;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<historicoAdotante> getHistoricoAdocoes() {
        return historicoAdocoes;
    }

    public void setHistoricoAdocoes(List<historicoAdotante> historicoAdocoes) {
        this.historicoAdocoes = historicoAdocoes;
    }
}
