public abstract class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone_Celular;

    public Pessoa(String nome, int idade, String cpf, String endereco, String email, String telefone_Celular) {

        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
        this.telefone_Celular = telefone_Celular;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone_Celular = telefone_Celular;
    }

    public String getNome() {
        return nome;
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

    public String getEmail() {
        return email;
    }

    public String getTelefone_Celular() {
        return telefone_Celular;
    }

    @Override
    public String toString() {
        return "[ id : " + cpf + "]" + "[" + "Pessoa [" + "Nome : " + nome + "]" +
                " [ Idade : " + idade + "]" +
                " [ CPF :'" + cpf + "]" +
                " [ Endereco :'" + endereco + "]" +
                " [ Email :'" + email + "]" +
                " [ Telefone Celular : '" + telefone_Celular + "]" +
                "]";
    }
}
