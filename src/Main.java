import java.util.ArrayList;
import java.util.List;

public class Main{
    @SuppressWarnings({ "unchecked", "unused" })
    public static void main(String[] args) {

        // Desenvolvimento do extend Pessoa
        Funcionario funcionario = new Funcionario("Pedro", 24, "12345678910", "rua pedro sampaio 10",
        "pedrohenrique@gmail.com", "41999998888");
        Estagiario estagiario = new Estagiario("Roberto", 18, "13113113113", "rua gaspar 1222",
        "robertogames@email.com.br", "41987654321");
        Gerente gerente = new Gerente(40, "Junior", "11122233344", "rua maranhense 1233",
        "juniorJR@hotmail.com.br", "41988889999");
        Vendedor vendedor = new Vendedor("Gleyson", "77788899900", "rua nulo 444",
        "gleyson1212@email.com", "41955557777", 0);

        // Desenvolvimento do extend Veiculo
        Carro carro = new Carro("uno","hatch", "FIAT", 2008, "*2345678*");
        Carro carro2 = new Carro("civic","sedan", "honda", 2020, "*8765432*");

        Caminhonete caminhonete = new Caminhonete("ram", "cabine dupla","dodge", 2019, "*5555555*");
        Caminhonete caminhonete2 = new Caminhonete("hilux", "cabine simples","toyota", 2023, "*7777777*");

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
        Estoque<Pecas> estoquePecas2 = new Pecas(null, null, null, null);

        // Adicionando peças na Classe Estoque
        estoquePecas.adicionar(pecas);
        estoquePecas2.adicionar(pecas2);

    }
}