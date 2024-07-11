public class Movimentacao {
    private String descricao;
    private double valor;
    private boolean credito; // true se for crédito, false se for débito

    public Movimentacao(String descricao, double valor, boolean credito) {
        this.descricao = descricao;
        this.valor = valor;
        this.credito = credito;
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", tipo=" + (credito ? "Crédito" : "Débito") +
                '}';
    }
}
