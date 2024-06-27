class Carro implements Estocavel {
    private String nome;
    private String modelo;
    private String marca;
    private int ano;
    private String numChassi;
    private String cor;

    public Carro(String nome, String modelo, String marca, int ano, String numChassi, String cor) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.numChassi = numChassi;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String getIdentificador() {
        return numChassi;
    }

    @Override
    public String toString() {
        return "Carro [" + "Nome : " + nome + "]" + "|" + "[ Modelo : " + modelo + "]" + "|" + "[ Marca : " + marca
                + "]" + "|"
                + "[ Ano :"
                + ano + "]" + "|" + "[ Numero de Chassi : " + numChassi + "]" + "|" + "[ Cor : " + cor + "]";
    }
}