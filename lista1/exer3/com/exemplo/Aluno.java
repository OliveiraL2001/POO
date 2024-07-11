package com.exemplo;

import com.exemplo.Disciplina;
import com.exemplo.Pessoa;

public class Aluno extends Pessoa {
    private String curso;
    private Disciplina[] disciplinas;

    // Construtor
    public Aluno(String cpf, String nome, int idade, String curso, Disciplina[] disciplinas) {
        super(cpf, nome, idade);
        this.curso = curso;
        this.disciplinas = disciplinas;
    }

    // Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    // Método para exibir informações do aluno
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            disciplina.exibirInformacoes();
        }
    }

    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Matemática", "MAT101");
        Disciplina d2 = new Disciplina("Física", "FIS101");
        Disciplina[] disciplinas = { d1, d2 };

        Aluno aluno = new Aluno("987.654.321-00", "Maria Oliveira", 22, "Engenharia", disciplinas);
        aluno.exibirInformacoes();
    }
}
