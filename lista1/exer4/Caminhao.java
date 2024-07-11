public class Caminhao extends Veiculo {
    private double capacidadeDeCarga;

    public Caminhao(String cor, int potencia, int anoDeFabricacao, double valor, double capacidadeDeCarga) {
        super(cor, potencia, anoDeFabricacao, valor);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    // Getter e Setter
    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                "} " + super.toString();
    }
}
