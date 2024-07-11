public class Veiculo {
    private String cor;
    private int potencia;
    private int anoDeFabricacao;
    private double valor;

    public Veiculo(String cor, int potencia, int anoDeFabricacao, double valor) {
        this.cor = cor;
        this.potencia = potencia;
        this.anoDeFabricacao = anoDeFabricacao;
        this.valor = valor;
    }

    // Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", potencia=" + potencia +
                ", anoDeFabricacao=" + anoDeFabricacao +
                ", valor=" + valor +
                '}';
    }
}
