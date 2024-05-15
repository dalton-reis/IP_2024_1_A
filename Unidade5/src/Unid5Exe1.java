import java.util.Scanner;

public class Unid5Exe1 {

    // Descreva um algoritmo que leia 20 números inteiros e escreva,
    // para cada número lido, se o mesmo é par ou ímpar.
    public Unid5Exe1() {
        Scanner s = new Scanner(System.in);

        for (int quantidade = 0; quantidade < 20 ; quantidade++) {
            System.out.print("Digite um número: ");
            int numero = s.nextInt();

            if (numero % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("ÍMPAR");
            }
        }

        s.close();
    }

    public static void main(String[] args) {
        new Unid5Exe1();
    }
}
