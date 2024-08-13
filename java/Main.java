import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a capacidade da pilha e da fila: ");
        int capacidade = scanner.nextInt();

        Pilha pilha = new Pilha(capacidade);
        Fila fila = new Fila(capacidade);

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir elemento na pilha");
            System.out.println("2. Remover elemento da pilha");
            System.out.println("3. Imprimir elementos da pilha");
            System.out.println("4. Inserir elemento na fila");
            System.out.println("5. Remover elemento da fila");
            System.out.println("6. Imprimir elementos da fila");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento a ser inserido na pilha: ");
                    int elementoPilha = scanner.nextInt();
                    pilha.insere(elementoPilha);
                    break;

                case 2:
                    int removidoPilha = pilha.remove();
                    if (removidoPilha != -1) {
                        System.out.println("Elemento removido da pilha: " + removidoPilha);
                    }
                    break;

                case 3:
                    pilha.imprime();
                    break;

                case 4:
                    System.out.print("Digite o elemento a ser inserido na fila: ");
                    int elementoFila = scanner.nextInt();
                    fila.insere(elementoFila);
                    break;

                case 5:
                    int removidoFila = fila.remove();
                    if (removidoFila != -1) {
                        System.out.println("Elemento removido da fila: " + removidoFila);
                    }
                    break;

                case 6:
                    fila.imprime();
                    break;

                case 7:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}