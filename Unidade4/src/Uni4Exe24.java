import java.util.Scanner;

public class Uni4Exe24 {
    /*
     * Dados 3 valores, escreva um algoritmo que os informe em uma
     * determinada ordem a partir de um menu de opções:
     * 
     * se opção = 1, escreva os 3 valores em ordem crescente
     * se opção = 2, escreva os 3 valores em ordem decrescente
     * se opção = 3, escreva os 3 valores de forma que o maior
     * valor fique no meio
     */
    public Uni4Exe24() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor 1:");
        int valor1 = entrada.nextInt();
        System.out.print("Digite o valor 2: ");
        int valor2 = entrada.nextInt();
        System.out.print("Digite o valor 3: ");
        int valor3 = entrada.nextInt();

        int maior, menor, meio;

        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        } else if (valor2 < valor3) {
            menor = valor2;
        } else {
            menor = valor3;
        }

        if ((valor1 == maior || valor1 == menor) &&
                (valor2 == maior || valor2 == menor)) {
            meio = valor3;
        } else if ((valor1 == maior || valor1 == menor) &&
                (valor3 == maior || valor3 == menor)) {
            meio = valor2;
        } else {
            meio = valor1;
        }

        System.out.println("Digite 1 para ordem crescente \n2 para " +
            "ordem decrescente\n3 para o maior no meio: ");
        int opcao = entrada.nextInt();

        /*if (opcao == 1) {

        } else if (opcao == 2) {

        } else if (opcao == 3) {

        } else {

        }*/
        switch(opcao) {
            case 1:
                System.out.println("Ordem crescente: ");
                System.out.println(menor + " " + meio + " " + maior);
                break;
            case 2:
                System.out.println("Ordem decrescente: ");
                System.out.println(maior + " " + meio + " " + menor);
                break;
            case 3:
                System.out.println("Maior no meio: ");
                System.out.println(menor + " " + maior + " " + meio);
                break;
            default: System.out.println("Opção inválida");
        }

        entrada.close();
    }

    public static void main(String[] args) {
        new Uni4Exe24();
    }
}
