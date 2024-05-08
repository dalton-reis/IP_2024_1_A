import java.util.Scanner;

public class Uni5Exe30 {
    /*
     * Implemente o problema da mochila. Tendo-se uma sequência
     * decrescente de números inteiros positivos que inicia em N,
     * com decremento inteiro positivo
     * K, deseja-se empacotá-los em uma mochila com tamanho M, de
     * forma que se coloque dentro dela preferencialmente os maiores
     * valores, até que ela esteja cheia. N e K são inteiros e devem
     * ser definidos pelo usuário. Faça um algoritmo que imprima:
     * 
     * os elementos a serem colocados na mochila;
     * os elementos que entraram na mochila;
     * os que ficaram fora da mochila;
     * qual é a soma dos elementos que entraram na mochila;
     * qual a soma dos elementos que não entraram na mochila.
     */
    public Uni5Exe30() {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor inicial (N): ");
        int numero = s.nextInt();
        while (numero < 0) {
            System.out.println("Valor incorreto: número deve ser maior que 0");
            System.out.print("Digite o valor inicial (N): ");
            numero = s.nextInt();
        }

        int decremento = 0;
        do {
            System.out.print("Digite o valor de decremento (K): ");
            decremento = s.nextInt();
            if (decremento < 0) {
                System.out.println("Valor incorreto: número deve ser maior que 0");
            }
        } while (decremento < 0);

        int mochila = 0;
        do {
            System.out.print("Digite o tamanho da mochila (M): ");
            mochila = s.nextInt();
        } while (mochila < 0);

        String elementosNaMochila = "";
        String elementosForaDaMochila = "";
        int somaMochila = 0;
        int somaForaMochila = 0;
        System.out.print("Os elementos a serem colocados na mochila são: ");
        while (numero > 0) {
            System.out.print(numero + " ");

            if (mochila > 0) {
                elementosNaMochila += numero + ", ";
                somaMochila += numero;
                mochila--;
            } else {
                elementosForaDaMochila += numero + ", ";
                somaForaMochila += numero;
            }

            numero -= decremento;
        }

        System.out.println();
        elementosNaMochila = elementosNaMochila.trim().substring(0, elementosNaMochila.length() - 2);
        System.out.println("Elementos na mochila: " + elementosNaMochila);
        System.out.println("Soma da mochila: " + somaMochila);
        elementosForaDaMochila = elementosForaDaMochila.trim().substring(0, elementosForaDaMochila.length() - 2);
        System.out.println("Não couberam na mochila: " + elementosForaDaMochila);
        System.out.println("Soma dos elementos fora: " + somaForaMochila);

        s.close();
    }

    public static void main(String[] args) {
        new Uni5Exe30();
    }
}
