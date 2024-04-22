import java.util.Scanner;

public class Unid4Exe26 {
    public Unid4Exe26() {

        Scanner s = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("'T': calcular a área de um triângulo de base b e altura h");
        System.out.println("‘Q’: calcular a área de um quadrado de lado l");
        System.out.println("‘R’: calcular a área de um retângulo de base b e altura h");
        System.out.println("‘C’: calcular a área de um círculo de raio r");
        char opcao = s.nextLine().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo");
                float base = s.nextFloat();
                float altura = s.nextFloat();
                System.out.println("Área do triângulo = " + (base * altura) / 2);
                break;
            case 'Q':
                System.out.print("Digite o lado: ");
                float lado = s.nextFloat();
                System.out.println("Área do quadrado = " + (lado * lado));
                break;
            case 'R':
                System.out.println("Digite a base e a altura do retangulo: ");
                float b = s.nextFloat();
                float h = s.nextFloat();
                System.out.println("Área do retângulo = " + b * h);
                break;
            case 'C':
                System.out.print("Digite o raio: ");
                float r = s.nextFloat();
                if (r > 0) {
                    System.out.println("Área do círculo = " + Math.PI * Math.pow(r, 2));
                } else {
                    System.out.println("Raio deve ser maior que 0");
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        s.close();
    }

    public static void main(String[] args) {
        new Unid4Exe26();
    }
}
