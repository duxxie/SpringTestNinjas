package com.example.ainda.Missoes;

import com.example.ainda.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas= new ArrayList<>();

    public MissaoModel() {
    }

    public MissaoModel(String nome, String dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_missao() {
        return nome_missao;
    }

    public void setNome_missao(String nome_missao) {
        this.nome_missao = nome_missao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<NinjaModel> getNinjas_na_missao() {
        return ninjas_na_missao;
    }

    public void setNinjas_na_missao(List<NinjaModel> ninjas_na_missao) {
        this.ninjas_na_missao = ninjas_na_missao;
    }
}
