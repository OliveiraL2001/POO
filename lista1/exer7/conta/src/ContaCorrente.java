import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;
    private List<Movimentacao> movimentacoes;

    public ContaCorrente(int numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
        this.movimentacoes = new ArrayList<>();
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void adicionarMovimentacao(Movimentacao movimentacao) {
        this.movimentacoes.add(movimentacao);
        if (movimentacao.isCredito()) {
            this.saldo += movimentacao.getValor();
        } else {
            this.saldo -= movimentacao.getValor();
        }
    }

    public boolean podeSacar(double valor) {
        return this.saldo + this.limite >= valor;
    }

    public void sacar(double valor) {
        if (podeSacar(valor)) {
            Movimentacao movimentacao = new Movimentacao("Saque", valor, false);
            adicionarMovimentacao(movimentacao);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(double valor) {
        Movimentacao movimentacao = new Movimentacao("Depósito", valor, true);
        adicionarMovimentacao(movimentacao);
    }

    public void emitirExtrato() {
        System.out.println("Extrato da Conta " + numero + ":");
        for (Movimentacao mov : movimentacoes) {
            System.out.println(mov);
        }
        System.out.println("Saldo atual: " + saldo);
    }
}
