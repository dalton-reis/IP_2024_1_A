import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        new Exercicio5();
    }

    /* Análise: OK
     * Entrada: total de frangos
     * Saída: total gasto com os chips
     * Processo:
     * ler quantidadeFrangos
     * totalGasto = quantidadeFrango * (4 + (3.5*2))
     * escrever totalGasto
     */
    public Exercicio5() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de frangos: ");
        int quantidadeFrangos = entrada.nextInt();
        int chip = 4;
        float totalGasto = quantidadeFrangos * (chip + (3.5f*2));
        //int totalGasto = quantidadeFrangos * (4 + 7);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Total a pagar R$" + df.format(totalGasto));
        entrada.close();
    }
}
