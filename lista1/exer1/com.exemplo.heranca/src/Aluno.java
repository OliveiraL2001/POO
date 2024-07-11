public class Aluno extends Pessoa {
    private String curso;
    private String disciplina;

    // Construtor
    public Aluno(String cpf, String nome, int idade, String curso, String disciplina) {
        super(cpf, nome, idade);
        this.curso = curso;
        this.disciplina = disciplina;
    }

    // Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Método para exibir informações do aluno
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
        System.out.println("Disciplina: " + disciplina);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("987.654.321-00", "Maria Oliveira", 22, "Engenharia", "Matemática");
        aluno.exibirInformacoes();
    }
}
