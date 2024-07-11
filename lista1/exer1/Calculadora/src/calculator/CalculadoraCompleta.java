

package calculator;

public class CalculadoraCompleta extends calculator.Calculadora {
    // Método para raiz quadrada
    public double raizQuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(a);
    }

    // Método para potência ao quadrado
    public double potenciaAoQuadrado(double a) {
        return Math.pow(a, 2);
    }

    public static void main(String[] args) {
        // Testando a classe CalculadoraCompleta
        CalculadoraCompleta calcCompleta = new CalculadoraCompleta();
        System.out.println("Soma: " + calcCompleta.soma(10, 5));
        System.out.println("Subtração: " + calcCompleta.subtracao(10, 5));
        System.out.println("Multiplicação: " + calcCompleta.multiplicacao(10, 5));
        System.out.println("Divisão: " + calcCompleta.divisao(10, 5));
        System.out.println("Raiz Quadrada: " + calcCompleta.raizQuadrada(25));
        System.out.println("Potência ao Quadrado: " + calcCompleta.potenciaAoQuadrado(5));
    }
}
