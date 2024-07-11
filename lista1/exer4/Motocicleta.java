public class Motocicleta extends Veiculo {
    private boolean temBagageiro;

    public Motocicleta(String cor, int potencia, int anoDeFabricacao, double valor, boolean temBagageiro) {
        super(cor, potencia, anoDeFabricacao, valor);
        this.temBagageiro = temBagageiro;
    }

    // Getter e Setter
    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "temBagageiro=" + temBagageiro +
                "} " + super.toString();
    }
}
