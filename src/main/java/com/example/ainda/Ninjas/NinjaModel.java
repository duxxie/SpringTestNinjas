package com.example.ainda.Ninjas;

import com.example.ainda.Missoes.MissaoModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

// Transforma em uma entidade no BD
// JPA
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    // Indica que o dado é um ID
    // Acrescenta valor da ID automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissaoModel missao;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
