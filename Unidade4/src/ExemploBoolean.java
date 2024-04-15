import java.util.Scanner;

public class ExemploBoolean {
    public ExemploBoolean() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um valor true ou false: ");
        boolean valor = s.nextBoolean();

        if (valor) {
            System.out.println("É verdade");
        } else {
            System.out.println("É falso");
        }

        if (!valor)  {
            System.out.println("É falso");
        }

        


        s.close();

    }
    
    public static void main(String[] args) {
        new ExemploBoolean();
    }
}
