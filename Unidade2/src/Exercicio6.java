import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

    public Exercicio6() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = entrada.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        //float quantidadeHoras = entrada.nextFloat();
        int quantidadeHoras = entrada.nextInt();
        System.out.print("Digite o valor da hora: ");
        float valorHora = entrada.nextFloat();

       float salario = quantidadeHoras * valorHora;
       /*  System.out.println("Funcinário " + numeroFuncionario +
        " possui o salário R$ " +salario);
        */

        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("Funcinário " + numeroFuncionario +
                " possui o salário R$ " + formatador.format(salario));

        entrada.close();
    }

    public static void main(String[] args) {
        new Exercicio6();
    }

}
