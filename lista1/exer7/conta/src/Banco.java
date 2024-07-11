import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaCorrente> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void criarConta(String numero, boolean ehEspecial, double limite) {
        contas.add(new ContaCorrente(numero, ehEspecial, limite));
    }

    public void excluirConta(String numero) {
        contas.removeIf(conta -> conta.getNumero().equals(numero));
    }

    public ContaCorrente buscarConta(String numero) {
        for (ContaCorrente conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }

    public boolean sacar(String numero, double valor, String descricao) {
        ContaCorrente conta = buscarConta(numero);
        if (conta != null) {
            return conta.sacar(valor, descricao);
        }
        return false;
    }

    public void depositar(String numero, double valor, String descricao) {
        ContaCorrente conta = buscarConta(numero);
        if (conta != null) {
            conta.depositar(valor, descricao);
        }
    }

    public void emitirSaldo(String numero) {
        ContaCorrente conta = buscarConta(numero);
        if (conta != null) {
            System.out.println("Saldo da conta " + numero + ": " + conta.getSaldo());
        }
    }

    public void emitirExtrato(String numero) {
        ContaCorrente conta = buscarConta(numero);
        if (conta != null) {
            conta.exibirExtrato();
        }
    }

    public boolean transferir(String numeroOrigem, String numeroDestino, double valor, String descricao) {
        ContaCorrente contaOrigem = buscarConta(numeroOrigem);
        ContaCorrente contaDestino = buscarConta(numeroDestino);

        if (contaOrigem != null && contaDestino != null && contaOrigem.sacar(valor, "Transferência para " + numeroDestino + ": " + descricao)) {
            contaDestino.depositar(valor, "Transferência de " + numeroOrigem + ": " + descricao);
            return true;
        }
        return false;
    }
}
