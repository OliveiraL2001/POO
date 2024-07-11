public class Data {
    private int mes;
    private int dia;
    private int ano;

    // Construtor que inicializa as variáveis
    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    // Getters e Setters
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método exibeData
    public void exibeData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
