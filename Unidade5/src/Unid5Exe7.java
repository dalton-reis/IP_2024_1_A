import java.util.Scanner;

public class Unid5Exe7 {
    /*
     * Descreva um algoritmo que leia um número inteiro n e, dados n números reais
     * informe o maior e o menor número.
     */
    public Unid5Exe7() {

        float menor = Float.MAX_VALUE; //maior número possível
        float maior = Float.MIN_VALUE;  //menor número possível
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a quantidade de números a ser informado: ");
        int n = s.nextInt();

        for (int quantidade = 0; quantidade < n; quantidade++) {
            System.out.print("Digite o número: ");
            float numero = s.nextFloat();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número é " + maior + "\nMenor número é " + menor);
        s.close();
    }

    public static void main(String[] args) {
        new Unid5Exe7();
    }
}
