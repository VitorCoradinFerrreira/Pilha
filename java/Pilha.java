public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("A pilha está cheia. Não é possível inserir o elemento.");
        } else {
            topo++;
            dados[topo] = elemento;
        }
    }

    public int remove() {
        if (vazia()) {
            System.out.println("A pilha está vazia. Não é possível remover nenhum elemento.");
            return -1;
        } else {
            int elementoRemovido = dados[topo];
            topo--;
            return elementoRemovido;
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("Elementos na pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(dados[i] + " ");
            }
            System.out.println();
        }
    }
}
