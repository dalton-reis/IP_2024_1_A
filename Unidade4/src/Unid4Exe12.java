import java.util.Scanner;

public class Unid4Exe12 {
 
    public Unid4Exe12() {
        Scanner s = new Scanner(System.in);

        System.out.print("Entre com o comprimento do lado 1: ");
        int lado1 = s.nextInt();
        System.out.print("Entre com o comprimento do lado 2: ");
        int lado2 = s.nextInt();
        System.out.print("Entre com o comprimento do lado 3: ");
        int lado3 = s.nextInt();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado2 + lado1)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("É isósceles");
            } else {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("Não formam um triângulo");
        }
        s.close();
    }

    public static void main(String[] args) {
        new Unid4Exe12();
    }
}
