public class TesteCadernoDeEnderecos {
    public static void main(String[] args) {
        // Cria um objeto CadernoDeEnderecos
        CadernoDeEnderecos pessoa = new CadernoDeEnderecos(
                "João Silva",
                "1234-5678",
                "joao.silva@example.com",
                "20/05/1985",
                "Rua das Flores, 123, Cidade, Estado"
        );

        // Exibe as informações da pessoa
        System.out.println("Informações iniciais da pessoa:");
        pessoa.exibirInformacoes();

        // Modifica alguns valores
        pessoa.setTelefone("9876-5432");
        pessoa.setEmail("joao.silva_novo@example.com");

        // Exibe as informações modificadas
        System.out.println("\nInformações modificadas da pessoa:");
        pessoa.exibirInformacoes();
    }
}
