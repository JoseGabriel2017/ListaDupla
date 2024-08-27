
public class MetodosDupla<T> {

    private NoDuplo<T> cabeca, calda;
    private int tamanho;

    public MetodosDupla() {
        this.cabeca = null;
        this.calda = null;
        this.tamanho = 0;
    }

    public void addNoDuploInicio(T elemento) {

        NoDuplo<T> celula = new NoDuplo<T>(elemento);

        if (tamanho == 0) {
            celula = cabeca;
            celula = calda;

        } else {
            celula.setProximo(cabeca);
            cabeca.setAnterior(celula);
            ;
            cabeca = celula;

        }
        this.tamanho++;
    }

    public void addNoDuploFim(T elemento) {

        NoDuplo<T> celula = new NoDuplo<T>(elemento);

        if (tamanho == 0) {
            celula = cabeca;
            celula = calda;

        } else {
            celula.setAnterior(calda);
            calda.setProximo(celula);
            calda = celula;
        }
        this.tamanho++;
    }

    public void addPorPosicao(int index, T elemento) {

        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Index fora do tamanho da lista");
        }

        if (index == 0) {

            addNoDuploInicio(elemento);

        } else if (index == tamanho) {

            addNoDuploFim(elemento);

        } else {

            NoDuplo<T> celula = new NoDuplo<T>(elemento);
            NoDuplo<T> aux = cabeca;

            for (int i = 0; i < index; i++) {
                aux = aux.getProximo();
            }

            celula.setAnterior(aux.getAnterior());
            aux.getAnterior().setProximo(celula);
            celula.setProximo(aux);
            aux.setAnterior(celula);
            this.tamanho++;

        }

    }

    public void excluirInicio() {

        cabeca = cabeca.getProximo();

        if (cabeca != null) {
            cabeca.setAnterior(null);
        } else {
            calda = null;
            System.out.println(" ");
            System.out.println("A lista está vazia!");
        }
    }

    public void excluirFinal() {

        calda = calda.getAnterior();

        if (calda != null) {
            calda.setProximo(null);
        } else {
            cabeca = null;
            System.out.println(" ");
            System.out.println("A lista está vazia!");
        }
    }

    public void excluirPorPosicao(int index) {

        if (index == 0) {
            excluirInicio();
        } else if (index == tamanho - 1) {
            excluirFinal();
        } else {

            NoDuplo<T> atual = cabeca;
            for (int i = 0; i < index; i++) {
                atual = atual.getProximo();
            }

            atual.getAnterior().setProximo(atual.getProximo());
            atual.getProximo().setAnterior(atual.getAnterior());
            tamanho--;

        }
    }

    public void imprimirLista() {

        NoDuplo<T> atual = cabeca;

        while (atual != null) {
            System.out.println(atual + " ");
            atual = atual.getProximo();
        }
    }

}
