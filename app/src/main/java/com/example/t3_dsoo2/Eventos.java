package com.example.t3_dsoo2;

/**
 * Created by geevb on 30/10/17.
 */

public class Eventos {

    private String nome;
    private String descricao;
    private String data;
    private String horario;
    private String valor;
    private String endereco;
    private String faixaEtaria;

    public Eventos(String nome, String descricao, String data, String horario,
                   String valor, String endereco, String faixaEtaria){
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.horario = horario;
        this.valor = valor;
        this.endereco = endereco;
        this.faixaEtaria = faixaEtaria;
    }

    @Override
    public String toString(){
        return nome + " - " + data;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataDaFesta() {
        return data;
    }

    public String getValor() {
        return valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public String getHorario(){
        return horario;
    }

}
