public class Funcionarios extends Pessoa {

    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone_Celular;

    public Funcionarios(int id, String nome, int idade, String cpf, String endereco, String email,
            String telefone_Celular) {
        super(nome, idade, cpf, endereco, email, telefone_Celular);

        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone_Celular = telefone_Celular;

    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone_Celular() {
        return telefone_Celular;
    }

}
