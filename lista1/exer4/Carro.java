public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String cor, int potencia, int anoDeFabricacao, double valor, int numeroDePortas) {
        super(cor, potencia, anoDeFabricacao, valor);
        this.numeroDePortas = numeroDePortas;
    }

    // Getter e Setter
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroDePortas=" + numeroDePortas +
                "} " + super.toString();
    }
}
