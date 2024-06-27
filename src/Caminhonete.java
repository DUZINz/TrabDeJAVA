public class Caminhonete extends Veiculo {

    private String numChassi;
    private String nome;
    private String marca;
    private String modelo;
    private int ano;

    public Caminhonete(String nome, String modelo, String marca, int ano, String numChassi) {
        super(nome, modelo, marca, ano, numChassi, modelo);

        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.numChassi = numChassi;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getId() {
        return numChassi;
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
                ", nome :'" + nome + '\'' +
                ", modelo :'" + modelo + '\'' +
                ", ano :'" + ano + '\'' +
                ", Número do chassi :'" + numChassi + '\'' +
                '}';

    }

    public void add(Caminhonete caminhonete) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
