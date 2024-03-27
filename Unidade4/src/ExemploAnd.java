import java.util.Scanner;

public class ExemploAnd {
    
    public ExemploAnd() {
        Scanner  s = new Scanner(System.in);
        System.out.print("Digite um sinal +, -, /, *: ");
        char sinal = s.nextLine().charAt(0); //Pega o 1o caractere digitado
        System.out.print("Numero 1: ");
        int n1 = s.nextInt();
        System.out.print("Numero 2: ");
        int n2 = s.nextInt();

        if (sinal == '/' && n2 != 0) {
            int resultado = n1 / n2;
            System.out.println(resultado);
        }
        
        //O código seguinte é equivalente ao uso do &&:
        if (sinal == '/') {
            if (n2 != 0) {
                int resultado = n1 / n2;
                System.out.println(resultado);
            }
        }
        

        s.close();
    }

    public static void main(String[] args) {
        new ExemploAnd();
    }
}
