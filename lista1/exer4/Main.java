public class Main {
    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta("Vermelha", 150, 2020, 15000.0, true);
        Carro carro = new Carro("Azul", 110, 2018, 45000.0, 4);
        Caminhao caminhao = new Caminhao("Branco", 300, 2015, 120000.0, 5000.0);

        System.out.println(moto);
        System.out.println(carro);
        System.out.println(caminhao);
    }
}
