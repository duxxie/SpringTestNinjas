package com.example.ainda;

import jakarta.persistence.*;
// Transforma em uma entidade no BD
// JPA
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    // Indica que o dado é um ID
    // Acrescenta valor da ID automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
