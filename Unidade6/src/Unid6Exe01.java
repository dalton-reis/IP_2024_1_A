import java.util.Scanner;

public class Unid6Exe01 {
    /*
     * Descreva um algoritmo que leia 10 números inteiros e os coloque
     * em um vetor
     * de 10 posições do tipo inteiro. Escreva na ordem inversa em que
     * foram lidos.
     * Faça um método para ler e outro para escrever.
     * 
     */
    public Unid6Exe01() {
        int numeros[] = new int[3];

        // ler(numeros);//this.ler(numeros);

        int tamanho = 3;
        numeros = lerVetor(tamanho);

        // int numero = 0;
        // ler(numero);
        // System.out.println(numero);

        escrever(numeros);

    }

    public void escrever(int[] numeros) {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
    /*
     * private void ler(int n) {
     * Scanner entrada = new Scanner(System.in);
     * System.out.print("Digite um número: ");
     * n = entrada.nextInt();
     * entrada.close();
     * }
     */

    private int[] lerVetor(int tamanho) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[tamanho];
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite um número (" + posicao + "): ");
            vetor[posicao] = entrada.nextInt();
        }
        entrada.close();

        return vetor;
    }

    // método sem retorno (void) e sem parâmetro/entrada (())
    private void ler(int[] vetor) {
        Scanner entrada = new Scanner(System.in);
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite um número (" + posicao + "): ");
            vetor[posicao] = entrada.nextInt();
        }
        entrada.close();
    }

    public static void main(String[] args) {
        new Unid6Exe01();
    }
}
