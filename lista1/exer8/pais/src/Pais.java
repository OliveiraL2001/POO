import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private String capital;
    private double dimensao;
    private List<Pais> fronteiras;

    // Construtor que inicializa o nome, a capital e a dimensão
    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    // Método para verificar se dois países são iguais
    @Override
    public boolean equals(final Pais outro) {
        if (this == outro) return true;
        if (outro == null) return false;
        return nome.equals(outro.getNome()) && capital.equals(outro.getCapital());
    }

    // Método para definir quais outros países fazem fronteira
    public void adicionarFronteira(Pais outro) {
        if (outro != null && !this.equals(outro) && !fronteiras.contains(outro)) {
            fronteiras.add(outro);
        }
    }

    // Método que retorna a lista de países que fazem fronteira
    public List<Pais> listarFronteiras() {
        return fronteiras;
    }

    // Método que retorna uma lista de vizinhos comuns entre dois países
    public List<Pais> vizinhosComuns(Pais outro) {
        List<Pais> comuns = new ArrayList<>();
        for (Pais pais : fronteiras) {
            if (outro.getFronteiras().contains(pais)) {
                comuns.add(pais);
            }
        }
        return comuns;
    }

    // Método toString para exibição dos dados do país
    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", capital='" + capital + '\'' +
                ", dimensao=" + dimensao +
                ", fronteiras=" + fronteiras.size() +
                '}';
    }
}
