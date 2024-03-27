import java.util.Scanner;

public class Unid4Exe06 {

    /*
     * Faça um algoritmo que leia um caractere. Caso seja digitada
     * a letra 'M'
     * escreva “Masculino”. Se for digitada a letra 'F' escreva
     * “Feminino”. Se for
     * informado 'I' escreva “Não Informado”. Qualquer outra letra
     * digitada escreva
     * “Entrada Incorreta”. Atenção: antes de testar a letra,
     * converta-a para
     * maiúscula.
     */

    // Entrada: caractere - "abreviação do sexo"
    // Saída: sexo
    // Processo:
    // ler caractere
    // se caractere é M
    // escrever Masculino
    // se caractere é F
    // escrever Feminino
    // se caractere é I
    // escrever Não Informado
    // senao
    // escrever Entrada Incorreta

    // Teste:
    // caractere - F / Feminino
    // caractere - M / Masculino
    // caractere - J / Entrada Incorreta
    public Unid4Exe06() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite F para feminino, M para masculino ou I para não informar: ");
        String caractere = entrada.nextLine();
        //toUpperCase é um método da String que converte TODAS
        //as letras para maiúsculo
        caractere = caractere.toUpperCase(); 

        //charAt é um método da String que pega somente 1 caractere
        //conforme o índice e converte para char
        char letra = caractere.charAt(0);

        //char exemplo = entrada.nextLine().toUpperCase().charAt(0);


        if (letra == 'M') {
            System.out.println("Masculino");
        } else if (letra == 'F') {
            System.out.println("Feminino");
        } else if (letra == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada Inválida");
        }

        //Execução com operadores lógicos:
        if (letra == 'M' || letra == 'F' || letra == 'I') {
            System.out.println("Valor válido");
        } else {
            System.out.println("Valor inválido");
        }


        entrada.close();
    }

    public static void main(String[] args) {
        new Unid4Exe06();
    }
}
