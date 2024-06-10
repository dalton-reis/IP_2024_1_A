import java.util.Scanner;

public class Unid6Exe4ComMetodoV1 {
    /*
     * Uni6Exe04.java - Faça um programa para ler os valores de dois
     *  vetores de
     * inteiros, cada um contendo 10 elementos. Crie um terceiro vetor
     *  em que cada
     * elemento é a soma dos valores contidos nas posições respectivas
     *  dos vetores
     * originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6]
     *  vetor3 = [2,7,9].
     * Exiba, ao final, os três vetores na tela. Faça três métodos:
     *  um método para
     * ler valores dos vetores, outro para somar e outro para escrever
     *  os vetores.
     */

    public Unid6Exe4ComMetodoV1() {

        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        
        lerValores(vetor1, vetor2);
        int[] v3 = somar(vetor1, vetor2);
        
        escrever(v3);
    }


    private void lerValores(int[] vetor1, int vetor2[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Popular vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Número [" + i + "]: ");
            vetor1[i] = s.nextInt();
        }

        System.out.println("Popular vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Número [" + i + "]: ");
            vetor2[i] = s.nextInt();
        }
        s.close();
    }

    private int[] somar(int[] vetor1, int[] vetor2) {
        int vetor3[] = new int[4];
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        return vetor3;
    }

    private void escrever(int vetor[]) {
        for (int pos = 0; pos < vetor.length; pos++) {
            System.out.println(vetor[pos]);
        }
    }

    public static void main(String[] args) {
        new Unid6Exe4ComMetodoV1();
    }
}
