
public interface Gerenciavel<T> {
    void adicionar(T item);

    void remover(T item);

    T buscar(String id);
}
