public class NoDuplo<T> {

    private T elemento;
    private NoDuplo<T> proximo, anterior;

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    public NoDuplo() {
    }

    public NoDuplo(T elemento) {
        this.elemento = elemento;
    }

    public NoDuplo(T elemento, NoDuplo<T> proximo, NoDuplo<T> anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "NoDuplo [elemento=" + elemento + ", proximo=" + proximo + ", anterior=" + anterior + "]";
    }

}
