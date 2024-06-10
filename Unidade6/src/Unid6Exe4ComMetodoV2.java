import java.util.Scanner;

public class Unid6Exe4ComMetodoV2 {
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

    public Unid6Exe4ComMetodoV2() {
        Scanner s = new Scanner(System.in);
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        
        lerValores(s, vetor1);
        lerValores(s, vetor2);
        int[] v3 = somar(vetor1, vetor2);        
        escrever(v3);
        s.close();
    }


    private void lerValores(Scanner s, int[] vetor) {
        System.out.println("Popular vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número [" + i + "]: ");
            vetor[i] = s.nextInt();
        }
        
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
        new Unid6Exe4ComMetodoV2();
    }
}
