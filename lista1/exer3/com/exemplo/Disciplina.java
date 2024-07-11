package com.exemplo;

public class Disciplina {
    private String nome;
    private String codigo;

    // Construtor
    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método para exibir informações da disciplina
    public void exibirInformacoes() {
        System.out.println("Nome da Disciplina: " + nome);
        System.out.println("Código da Disciplina: " + codigo);
    }
}
