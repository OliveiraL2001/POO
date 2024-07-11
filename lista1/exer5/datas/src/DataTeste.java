import javax.xml.crypto.Data;

public class DataTeste {
    public static void main(String[] args) {
        // Cria um objeto Data
        Data data = new Data(5, 20, 2024);

        // Exibe a data inicial
        System.out.print("Data inicial: ");
        data.exibeData();

        // Modifica os valores da data
        data.setMes(12);
        data.setDia(25);
        data.setAno(2024);

        // Exibe a data modificada
        System.out.print("Data modificada: ");
        data.exibeData();
    }
}
