


package calculator;

public class Calculadora {
    // Método para soma
    public double soma(double a, double b) {
        return a + b;
    }

    // Método para subtração
    public double subtracao(double a, double b) {
        return a - b;
    }

    // Método para multiplicação
    public double multiplicacao(double a, double b) {
        return a * b;
    }

    // Método para divisão
    public double divisao(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Testando a classe Calculadora
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.soma(10, 5));
        System.out.println("Subtração: " + calc.subtracao(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicacao(10, 5));
        System.out.println("Divisão: " + calc.divisao(10, 5));
    }
}
