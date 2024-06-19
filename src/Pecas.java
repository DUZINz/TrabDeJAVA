public class Pecas extends Estoque{
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