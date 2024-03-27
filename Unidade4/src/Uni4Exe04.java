/*Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou 
não casas decimais no número. */

import java.util.Scanner;

public class Uni4Exe04 {


    //Entrada: numero
    //Saída:tem casa decimal ou não
    //Processo
    public Uni4Exe04() {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numero = s.nextFloat();

        //Forma 1:
        if (numero % 1 == 0) {
            System.out.println("Não tem casas decimais");
        } else {
            System.out.println("Tem casas decimais");
        }

        //Forma 2:
        int numeroInteiro = (int)(numero);
        if (numero == numeroInteiro) {
            System.out.println("Não tem casas decimais");
        } else {
            System.out.println("Tem casas decimais");
        }

        //Forma 3:
        //converte um número para String:
        String numeroString = String.valueOf(numero);
        System.out.println("Número convertido: " + numeroString);
        int indiceInicial = numeroString.indexOf("."); //retorna o índice do caractere
        int indiceFinal = numeroString.length(); //tamanho da String
        String decimal = numeroString.substring(indiceInicial+1, indiceFinal);
        System.out.println("Parte decimal: " + decimal);

        int parteDecimal = Integer.parseInt(decimal);
        if (parteDecimal == 0) {
            System.out.println("Não tem casas decimais");
        } else {
            System.out.println("Tem casas decimais");
        } 

        if (decimal.trim().equals("0")) {
            System.out.println("Não tem casas decimais");
        } else {
            System.out.println("Tem casas decimais");
        }



        s.close();

    }

    public static void main(String[] args) {
        new Uni4Exe04();
    }
}
