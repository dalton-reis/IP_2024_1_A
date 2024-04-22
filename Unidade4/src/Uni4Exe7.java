import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe7 {
    public Uni4Exe7(){
        Scanner teclado = new Scanner (System.in);
        System.out.print("Entre com peso de carta: ");
        float peso = teclado.nextFloat();
        float valorPagar = 0;
        if (peso <= 50){
            valorPagar = 0.45f;
        } else {
            float pesoExcedido = peso - 50;
            float qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtAdicional;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Custo do selo: " +  (valorPagar));

        teclado.close();
    }
    public static void main(String[] args) {
        new Uni4Exe7();
    }
}
