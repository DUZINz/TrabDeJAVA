import java.util.*;

public class Estoque<T> {
    private List<T> lista;

    public Estoque() {
        this.lista = new ArrayList<>();
    }

    public void removerPorId(String id) {

        Iterator<T> iterator = lista.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (item instanceof Peca) {
                Peca peca = (Peca) item;
                if (peca.getId().equals(id)) {
                    iterator.remove();
                    System.out.println("Peça removida com sucesso.");
                    return;
                }
            }
        }
        System.out.println("Peça não encontrada.");
    }

    public void adicionar(T item) {
        lista.add(item);
    }

    public Peca buscarPorId(String id) {
        Iterator<T> iterator = lista.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (item instanceof Peca) {
                Peca peca = (Peca) item;
                if (peca.getId().equals(id)) {
                    return peca;
                }
            }
        }
        return null; // Caso não encontre a peça com o ID especificado
    }

    public Carro removerPorChassi(String numChassi) {
        Carro carro = buscarCarroPorChassi(numChassi);
        if (carro != null) {
            lista.remove(carro);
            System.out.println("Carro removido com sucesso.");
            return carro;
        } else {
            System.out.println("Carro não encontrado para remover.");
            return null;
        }
    }

    public Carro buscarCarroPorChassi(String numChassi) {
        for (T item : lista) {
            if (item instanceof Carro) {
                Carro carro = (Carro) item;
                if (carro.getNumChassi().equals(numChassi)) {
                    System.out.println("Carro encontrado:");
                    System.out.println(carro);
                    return carro;
                }
            }
        }
        System.out.println("Carro não encontrado.");
        return null; // Retorna null se não encontrar o carro com o chassi especificado
    }

    public void exibirTodos() {
        if (lista.isEmpty()) {
            System.out.println("Estoque de carros está vazio.");
        } else {
            System.out.println("Lista de Carros:");
            for (T item : lista) {
                System.out.println(item);
            }
        }
    }

    public List<T> getLista() {
        return lista;
    }
}
