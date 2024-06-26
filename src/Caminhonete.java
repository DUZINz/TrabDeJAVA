public class Caminhonete extends Veiculo{

    private String numchassi;
    private String nome;
    private String marca;
    private String modelo;
    private int ano;
    
    public Caminhonete(String nome, String modelo,String marca, int ano, String numchassi){
       super(nome, modelo, marca, ano, numchassi, modelo);

       this.nome = nome;
       this.modelo = modelo;
       this.marca = marca;
       this.ano = ano;
       this.numchassi = numchassi;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumchassi() {
        return numchassi;
    }

    public void setNumchassi(String numchassi) {
        this.numchassi = numchassi;
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

    @Override
    public String toString() {
        return "Carro{" +
                ", nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", Número do chassi='" + numchassi + '\'' +
                '}';
    
    }
}