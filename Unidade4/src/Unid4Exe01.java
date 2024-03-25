import java.util.Scanner;

public class Unid4Exe01 {

    public Unid4Exe01() {
        Scanner entrada = new Scanner(System.in);;
        System.out.print("Entre com as horas trabalhadas no mês: ");
        int horasMes = entrada.nextInt();
        System.out.print("Entre com o valor pago por hora: ");
        float horasValor = entrada.nextFloat();
        
        float salarioTotal = horasMes * horasValor;

        if (horasMes > 160) {
            float salarioExtra = (horasMes - 160) * (horasValor/2);
            //salarioTotal = salarioTotal + salarioExtra;
            salarioTotal += salarioExtra;
        }
        System.out.println("O salário total é: " + salarioTotal);

        entrada.close();
    }
 

    public static void main(String[] args) {
        new Unid4Exe01();
    }
}
