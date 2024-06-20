public class Veiculo {
    
    private String nome;
    private String modelo;
    private int ano;
    protected int numchassi;
    private String cor;
    protected boolean ligar;
    protected boolean desligar;

    public Veiculo(String nome, String modelo, int ano, int numchassi, String cor){

        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.numchassi = numchassi;
        this.cor = cor;
        this.ligar = false;
        this.desligar = false;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumchassi() {
        return numchassi;
    }

    public void setNumchassi(int numchassi) {
        this.numchassi = numchassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = true;

        System.out.println("Ligando o veículo!!");
    }

    public boolean isDesligar() {
        return desligar;
    }

    public void setDesligar(boolean desligar) {
        this.desligar = true;

        System.out.println("Desligando Veiculo!!");
    }

    public void Acelerar(){

        System.out.println("Acelerando Veículo!!");
    }

    public void Frear(){

        System.out.println("Freando veículo!!");
    }

    @Override
    public String toString() {
        return "Veículo{" +
        "nome='" + nome + '\'' +
        "Modelo='" + modelo + '\'' +
        ", Ano='" + ano + '\'' +
        ", Numchassi='" + numchassi + '\'' +
        ", Cor='" + cor + '\''+'}';
    }

}
