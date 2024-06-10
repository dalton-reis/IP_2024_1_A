import java.io.IOException;
import java.util.Scanner;

public class ExemploLimparConsole {

    public ExemploLimparConsole() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Inicio da escrita na console");
        System.out.println("Digite L para limpar a console");
        String valor = s.nextLine();
        if (valor.equalsIgnoreCase("L")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        s.close();
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        new ExemploLimparConsole();
    }
}
