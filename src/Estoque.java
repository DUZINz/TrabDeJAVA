public class Estoque {

    private String id;
    private String nome;
    private String descrição;
    private Float valor_Custo;

    public Estoque(String id, String nome, String descrição, Float valor_Custo) {

        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.valor_Custo = valor_Custo;
        
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Float getValor_Custo() {
        return valor_Custo;
    }

    public void setValor_Custo(Float valor_Custo) {
        this.valor_Custo = valor_Custo;
    }

    @Override
    public String toString(){
        return  "Estoque{"   +
                "ID='" + id + '\'' +
                ", Nome='" + nome + '\'' +
                ", Descrição='" + descrição + '\'' +
                ", valor_Custo='" + valor_Custo + '\'' +
                '}';
    }

}
