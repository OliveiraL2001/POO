public class PaisTeste {
    public static void main(String[] args) {
        // Criação de países
        Pais brasil = new Pais("Brasil", "Brasília", 8515767.0);
        Pais argentina = new Pais("Argentina", "Buenos Aires", 2780400.0);
        Pais uruguai = new Pais("Uruguai", "Montevidéu", 176215.0);
        Pais paraguai = new Pais("Paraguai", "Assunção", 406752.0);

        // Definindo fronteiras
        brasil.adicionarFronteira(argentina);
        brasil.adicionarFronteira(uruguai);
        brasil.adicionarFronteira(paraguai);

        argentina.adicionarFronteira(brasil);
        argentina.adicionarFronteira(uruguai);

        uruguai.adicionarFronteira(brasil);
        uruguai.adicionarFronteira(argentina);

        paraguai.adicionarFronteira(brasil);

        // Verificando fronteiras
        System.out.println("Fronteiras do Brasil: " + brasil.listarFronteiras());
        System.out.println("Fronteiras da Argentina: " + argentina.listarFronteiras());
        System.out.println("Fronteiras do Uruguai: " + uruguai.listarFronteiras());
        System.out.println("Fronteiras do Paraguai: " + paraguai.listarFronteiras());

        // Verificando se dois países são iguais
        System.out.println("Brasil e Argentina são iguais? " + brasil.equals(argentina));

        // Verificando vizinhos comuns
        System.out.println("Vizinhos comuns entre Brasil e Argentina: " + brasil.vizinhosComuns(argentina));
        System.out.println("Vizinhos comuns entre Brasil e Uruguai: " + brasil.vizinhosComuns(uruguai));
    }
}
