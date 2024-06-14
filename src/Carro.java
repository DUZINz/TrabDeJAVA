public class Carro extends Veiculo{

    private static int numchassi;
    private String nome;
    private String modelo;
    private int ano;

    public Carro (String nome, String modelo, int ano) {

        super(nome, modelo, ano, numchassi, modelo);

        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        
        }

        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }

        public String getModelo(){
            return modelo;
        }
        public void setModelo(String modelo){
            this.modelo = modelo;
        }

        public int getAno(){
            return ano;
        }
        public void setAno(int ano){
            this.ano = ano;
        }

        @Override
        public String toString(){
            return "Carro{" +
            ", nome='" + nome + '\'' +
            ", modelo='" + modelo + '\'' +
            ", ano='" + ano + '\'' +
            '}'; 
        }
}
