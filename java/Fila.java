public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.primeiro = 0;
        this.ultimo = -1;
        this.dados = new int[capacidade];
        this.tamanho = 0;
    }

    public boolean cheia() {
        return tamanho == capacidade;
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("A fila está cheia. Não é possível inserir o elemento.");
        } else {
            ultimo = (ultimo + 1) % capacidade;
            dados[ultimo] = elemento;
            tamanho++;
        }
    }

    public int remove() {
        if (vazia()) {
            System.out.println("A fila está vazia. Não é possível remover nenhum elemento.");
            return -1;
        } else {
            int elementoRemovido = dados[primeiro];
            primeiro = (primeiro + 1) % capacidade;
            tamanho--;
            return elementoRemovido;
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.print("Elementos na fila: ");
            for (int i = 0; i < tamanho; i++) {
                int index = (primeiro + i) % capacidade;
                System.out.print(dados[index] + " ");
            }
            System.out.println();
        }
    }
}