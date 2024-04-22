import java.util.Scanner;

public class RestoDivisao {

    public RestoDivisao() {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        //O operador resto da divisão (%) só pode ser utilizado com 
        //o tipo de dado Inteiro (int)

        int resto = numero % 2;

        //se não tem resto é par
        if (resto == 0) {
        //if (CONDIÇÃO) {
            //comandos que funcionarão SOMENTE se for verdadeiro
            System.out.println("Número é PAR");
        }

        //se tem resto é ímpar
        if (resto != 0) { //<> => !=
            System.out.println("Número é IMPAR");
        }

        boolean testeDengue = teclado.nextBoolean();

        //Se o teste for verdadeiro é dengue
        if (testeDengue) { //if (testeDengue == true)
            System.out.println("É dengue");
        }

        if (!testeDengue) { //testeDengue == false
            System.out.println("Não é dengue");
        }

        teclado.close();

    }


    public static void main(String[] args) throws Exception {
       new RestoDivisao();
    }
}
