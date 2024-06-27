class Peca implements Estocavel {
    private String id;
    private String nome;
    private int qtd;
    private Float valorCusto;

    public Peca(String id, String nome, int qtd, Float valorCusto) {
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
        this.valorCusto = valorCusto;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd() {
        return qtd;
    }

    public Float getValorCusto() {
        return valorCusto;
    }

    @Override
    public String getIdentificador() {
        return id;
    }

    @Override
    public String toString() {
        return "Pecas{" + "Id :'" + id + '\'' + ", Nome :'" + nome + '\'' + ", Quantidade :" + qtd
                + ", Valor de Custo :" + valorCusto
                + '}';
    }
}