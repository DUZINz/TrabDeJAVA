import java.util.List;

public class Clientes {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;

    public Clientes(int id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void remove(List<Clientes> clientes) {
        clientes.remove(this);
    }

    @Override
    public String toString() {
        return "Cliente[" +
                "Id : [" + id + "]" +
                " |> Nome : [" + nome + "]" +
                " |> Endereco : [" + endereco + "]" +
                " |> Telefone : [" + telefone + "]" +
                ']';
    }
}