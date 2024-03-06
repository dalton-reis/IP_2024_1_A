import java.util.Scanner;

public class Circulo {
    public Circulo() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Raio (em metros): ");
        float raio = leitor.nextFloat();
        //float PI = 3.14159f;
        double PI = Math.PI;

        //float area = (raio * raio) * PI;
        //Math.pow(base, expoente) = raio²
        double area = Math.pow(raio, 2) * PI;

        System.out.println("Área = " + area + "m2");
        leitor.close();
    }
    
    public static void main(String[] args) {
       new Circulo(); 
    }
}
