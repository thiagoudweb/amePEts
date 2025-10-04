package com.amepets.demo.model;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class DefaultPerson {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String telefone;

    // Construtor com todos os atributos //

    public DefaultPerson(String name, String email,String password,String cpf,String telefone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    // Construtor vazio para gerar um bean //
    public DefaultPerson() {
    }

    // Getters e Setters //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
