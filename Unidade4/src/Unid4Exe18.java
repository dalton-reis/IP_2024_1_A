import java.util.Scanner;

public class Unid4Exe18 {
    /*
     * Uma loja que trabalha com crediário funciona da seguinte maneira: se o
     * pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é
     * avisado que o pagamento está em dia. Se o pagamento é realizado até cinco
     * dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa
     * mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um
     * algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da
     * prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas
     * mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os
     * clientes nunca deixam para pagar no mês seguinte.
     */
    public Unid4Exe18() {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite o dia do vencimento até dia 10: ");
        int diaVencimento = s.nextInt();
        System.out.print("Digite o dia do pagamento: ");
        int diaPagamento = s.nextInt();
        System.out.print("Digite o valor da prestação: R$");
        float valorPrestacao = s.nextFloat();

        float valorPago = 0;

        if (diaPagamento <= diaVencimento) {
            //valorPago = valorPrestacao - (valorPrestacao * 0.1f);
            valorPago = valorPrestacao - (valorPrestacao * (10/100f));
            System.out.println("Pagamento em dia");
        } else if (diaPagamento <= (diaVencimento + 5)) {
            valorPago = valorPrestacao;
        } else {
            //multa 2% por dia de atraso:
            int diasAtraso = diaPagamento - diaVencimento; //-5 
            valorPago = valorPrestacao + ((valorPrestacao * 0.02f) * diasAtraso);
        }
        System.out.println("Valor pago: R$ " + valorPago);

        s.close();
    }

    public static void main(String[] args) {
        new Unid4Exe18();
    }
}
