import java.util.Scanner;

public class Exercicio5 {
    public Exercicio5() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("A: ");
        int a = teclado.nextInt();
        System.out.print("B: ");
        int b = teclado.nextInt();
        System.out.print("C: ");
        int c = teclado.nextInt();
        System.out.print("D: ");
        int d = teclado.nextInt();

        int diferenca = (a*b) - (c*d);

        System.out.println("Diferença = " + diferenca);

        teclado.close();

    }

    public static void main(String[] args) {
        new Exercicio5();
    }
}
