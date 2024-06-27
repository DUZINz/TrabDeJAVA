public class Veiculo {

    private String nome;
    private String modelo;
    private String marca;
    private int ano;
    protected String numChassi;
    private String cor;

    public Veiculo(String nome, String modelo, String marca, int ano, String numChassi, String cor) {

        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        if (numChassi.length() == 9) {
            this.numChassi = numChassi;
        } else {
            throw new IllegalArgumentException("Número do chassi deve ter 9 caracteres.");
        }
        this.cor = cor;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNumchassi() {
        return numChassi;
    }

    public void setNumchassi(String numChassi) {
        this.numChassi = numChassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
