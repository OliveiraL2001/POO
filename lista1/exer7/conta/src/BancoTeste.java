public class BancoTeste {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criação de contas
        banco.criarConta("12345", true, 1000.0);
        banco.criarConta("67890", false, 0.0);

        // Depósitos
        banco.depositar("12345", 500.0, "Depósito inicial");
        banco.depositar("67890", 300.0, "Depósito inicial");

        // Saques
        banco.sacar("12345", 200.0, "Saque para compras");
        banco.sacar("67890", 50.0, "Saque para alimentação");

        // Transferência
        banco.transferir("12345", "67890", 100.0, "Pagamento de dívida");

        // Emissão de saldo
        banco.emitirSaldo("12345");
        banco.emitirSaldo("67890");

        // Emissão de extrato
        banco.emitirExtrato("12345");
        banco.emitirExtrato("67890");

        // Exclusão de conta
        banco.excluirConta("12345");

        // Tentativa de emitir saldo de conta excluída
        banco.emitirSaldo("12345");
    }
}
