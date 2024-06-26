public class Caminhonete extends Veiculo{

    private int numchassi;
    private String nome;
    private String modelo;
    private int ano;

    public Caminhonete(String nome, String modelo, int ano, int numchassi){
       super(nome, modelo, ano, numchassi, modelo);

       this.nome = nome;
       this.modelo = modelo;
       this.ano = ano;
       this.numchassi = numchassi;

    }

    public int getNumchassi() {
        return numchassi;
    }

    public void setNumchassi(int numchassi) {
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

    public void add(Caminhonete caminhonete) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public int getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
