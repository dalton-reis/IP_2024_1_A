import java.util.Scanner;

public class Unid4Exe17 {
    /*
     * Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda
     * anual e o número de dependentes do contribuinte. A renda líquida é calculada
     * sobre a renda anual com um desconto de 2% para cada dependente do
     * contribuinte. O contribuinte com uma renda líquida de até R$ 2.000,00 não
     * paga imposto. Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$
     * 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas
     * líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$
     * 10.000,00 pagam 15% de imposto.
     */
    public Unid4Exe17() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a renda anual: R$");
        double rendaAnual = entrada.nextDouble();
        System.out.print("Digite a quantidade de dependentes: ");
        int qtdDependentes = entrada.nextInt();

        double rendaLiquida = rendaAnual - ((rendaAnual * 0.02) * qtdDependentes);
        System.out.println("Renda Líquida R$ " + rendaLiquida);
        double imposto = 0;
        if (rendaLiquida <= 2000) {
            imposto = 0;
        } else if (rendaLiquida > 2000 && rendaLiquida <= 5000) {
            imposto = rendaLiquida * 0.05;
        } else if (rendaLiquida > 5000 && rendaLiquida <= 10000.0) {
            imposto = rendaLiquida * 0.1;
        } else {
            imposto = rendaLiquida * 0.15;
        }

        if (imposto == 0) {
            System.out.println("isento de imposto");
        } else {
            System.out.println("Imposto R$" + imposto);
        }

        entrada.close();
    }

    public static void main(String[] args) {
        new Unid4Exe17();
    }
}
