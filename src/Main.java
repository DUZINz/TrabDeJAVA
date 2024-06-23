public class Main {

    @SuppressWarnings({ "unchecked", "unused" })
    public static void main (String[] args ) {

        // Desenvolvimento do extend Pessoa
        Funcionario funcionario = new Funcionario(null, 0, null, null, null, null);
        Estagiario estagiario = new Estagiario(null, 0, null, null, null, null);
        Gerente gerente = new Gerente(0, null, null, null, null, null);
        Vendedor vendedor = new Vendedor(null, null, null, null, null, 0);

        // Desenvolvimento do extend Veiculo
        Carro carro = new Carro(null, null, 0, 0);
        Carro carro2 = new Carro(null, null, 0, 0);


        // Desenvolçvimento do extend Estoque
        Pecas pecas = new Pecas(null, null, null, null);
        Pecas pecas2 = new Pecas(null, null, null, null);

        // Carros na classe Estoque
        Estoque<Carro> estoqueCarros = new Estoque<>(null, null, null, null);
        Estoque<Carro> estoqueCarros2 = new Estoque<>(null, null, null, null);
        
        // Adicionando carros no estoque
        estoqueCarros.adicionar(carro);
        estoqueCarros.adicionar(carro2);


        // Peças na classe Estoque
        Estoque<Pecas> estoquePecas = new Pecas(null, null, null, null);
        Estoque<Pecas> estoquePecas2 =new Pecas(null, null, null, null);

        // Adicionando peças na Classe Estoque
        estoquePecas.adicionar(pecas);
        estoquePecas2.adicionar(pecas2);
    }
}
