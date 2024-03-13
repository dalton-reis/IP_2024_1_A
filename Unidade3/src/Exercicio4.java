import java.util.Scanner;

public class Exercicio4 {

    /*
     * Análise: OK
     * Entrada: 3 notas
     * Saída: media
     * Processo: 
     * ler nota1
     * ler nota2
     * ler nota3
     * media = (nota1 * 5 + nota2 * 3 + nota3 * 2)/10
     * //media = nota1 * 0.5 + nota2 * 0.3 + nota3 * 0.2
     * escrever media
     * 
     * Teste1:
     * nota1 = 8
     * nota2 = 8
     * nota3 = 8
     * media = 8,0
     * 
     * Teste2:
     * nota1 = 7
     * nota2 = 6
     * nota3 = 8
     * media = 6,9
     * 
     */

    public Exercicio4() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Digite a nota 2: ");
        float nota2 = leitor.nextFloat();
        System.out.print("Digite a nota 3: ");
        float nota3 = leitor.nextFloat();

        float media = (nota1 * 5 + nota2 * 3 + nota3 * 2)/10;

        System.out.println("Média = " + media);
        leitor.close();
    }

    public static void main(String[] args) {
        new Exercicio4();
    }
}
