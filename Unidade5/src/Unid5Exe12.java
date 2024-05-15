import java.util.Scanner;

public class Unid5Exe12 {
    /*
     * Escreva um programa que leia um número inteiro positivo n e em seguida
     * imprima n linhas do chamado Triangulo de Floyd:
     */
    public Unid5Exe12() {
        Scanner s = new Scanner(System.in);
        int linha = s.nextInt();

        int cont = 1;
        for (int i = 1; i <= linha; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(cont + " ");
                cont++;
            }
            System.out.println();
        }

        s.close();
    }

    public static void main(String[] args) {
        new Unid5Exe12();
    }
}
