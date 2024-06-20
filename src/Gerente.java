public class Gerente extends Pessoa{

    private int idade;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone_Celular;

    public Gerente(int idade, String nome, String cpf, String endereco, String email, String telefone_Celular) {
        super(nome, idade, cpf, endereco, email, telefone_Celular);

        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone_Celular = telefone_Celular;
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    
}
