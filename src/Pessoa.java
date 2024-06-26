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
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone_Celular = telefone_Celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone_Celular() {
        return telefone_Celular;
    }

    public void setTelefone_Celular(String telefone_Celular) {
        this.telefone_Celular = telefone_Celular;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + nome + '\'' +
                "Idade='" + idade + '\'' +
                ", cpf='" + cpf + '\'' +
                ", Endereco='" + endereco + '\'' +
                ", Email='" + email + '\'' +
                ", Telefone Celular='" + telefone_Celular + '\'' +
                '}';
    }
}
