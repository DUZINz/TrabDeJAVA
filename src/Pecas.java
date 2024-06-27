public class Pecas extends Estoque {

    private String id;
    private String nome;
    private int qtd;
    private Float valor_custo;


    public Pecas(String id, String nome, int qtd, Float valor_Custo) {
        super(id, nome, qtd, valor_Custo);
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
        this.valor_custo = valor_custo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Float getValor_custo() {
        return valor_custo;
    }

    public void setValor_custo(Float valor_custo) {
        this.valor_custo = valor_custo;
    }

    @Override
    public String toString() {
        return "Pecas{" +
                "ID='" + id + '\'' +
                ", Nome ='" + nome + '\'' +
                ", Qtd='" + qtd + '\'' +
                ", Valor_Custo='" + valor_custo + '\'' + '}';
    }

    public void add(Pecas pecas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
