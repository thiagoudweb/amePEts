package com.amepets.demo.model;
import jakarta.persistence.*;
import java.util.List;



import java.util.List;

@Entity
@Table(name = "adotante_table")
public class AdotanteEntity extends DefaultPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private EnderecoEntity enderecos;

    @OneToMany(mappedBy = "adotante")
    private List<HistoricoAdocaoEntity> historicoAdocao;

    // Construtor com todos os atributos //
    public AdotanteEntity(String name, String email, String password, String cpf, String telefone, EnderecoEntity enderecos, List<HistoricoAdocaoEntity> historicoAdocao) {
        super(name, email, password, cpf, telefone);
        this.enderecos = enderecos;
        this.historicoAdocao = historicoAdocao;
    }

    // Construtor vazio para gerar um bean //
    public AdotanteEntity() {
        super();
    }

    public List<HistoricoAdocaoEntity> getHistoricoAdocao() {
        return historicoAdocao;
    }

    public void setHistoricoAdocao(List<HistoricoAdocaoEntity> historicoAdocao) {
        this.historicoAdocao = historicoAdocao;
    }

    public EnderecoEntity getEnderecos() {
        return enderecos;
    }

    public void setEnderecos ( EnderecoEntity enderecos) {
        this.enderecos = enderecos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
