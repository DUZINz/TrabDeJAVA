public class Pecas extends Estoque{
<<<<<<< HEAD

    private String id;
    private String nome;
    private String descrição;
    private Float valor_Custo;

    public Pecas(String id, String nome, String descrição, Float valor_Custo) {
        super(id, nome, descrição, valor_Custo);
        
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.valor_Custo = valor_Custo;

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

    
}
=======
    private String id;
    private String nome;
    private String description;
    private Float valor_custo;
        public Pecas(String id, String nome, String descrição, Float valor_Custo) {
            super(id, nome, descrição, valor_Custo);
            this.id = id;
            this.nome = nome;
            this.description = description;
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
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
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
                    ", Decription='" + description + '\'' +
                    ", Valor_Custo='" + valor_custo + '\''+'}';
    }
    }
>>>>>>> 8a9d3ac4b441a2bfe874e200c409e0afe32b3b0f
