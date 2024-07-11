public class CadernoDeEnderecos {
    private String nome;
    private String telefone;
    private String email;
    private String dataDeAniversario; // Usando String para simplicidade, mas poderia ser uma classe Data
    private String endereco;

    // Construtor que inicializa todas as variáveis
    public CadernoDeEnderecos(String nome, String telefone, String email, String dataDeAniversario, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeAniversario = dataDeAniversario;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataDeAniversario() {
        return dataDeAniversario;
    }

    public void setDataDeAniversario(String dataDeAniversario) {
        this.dataDeAniversario = dataDeAniversario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método para exibir as informações do Caderno de Endereços
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Data de Aniversário: " + dataDeAniversario);
        System.out.println("Endereço: " + endereco);
    }
}
