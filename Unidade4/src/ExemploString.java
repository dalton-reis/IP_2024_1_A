import java.util.Scanner;

public class ExemploString {

    public ExemploString() {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a palavra 1: ");
        String palavra1 = s.nextLine();
        System.out.println("Digite a palavra 2: ");
        String palavra2 = s.nextLine();

        if (palavra1.trim().equals(palavra2)) {
            System.out.println("As palavras são iguais");
        }

        if (palavra1.trim().equalsIgnoreCase(palavra2)) {
            System.out.println("O conteúdo das palavras são iguais");
        }

        if (palavra1.trim().toUpperCase().equals(palavra2.toUpperCase())) {
            System.out.println("conteudo igual " + palavra1.toUpperCase());
        }

        char letra = palavra1.trim().toUpperCase().charAt(0);
        switch (palavra1.charAt(0)) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("É uma vogal");
                break;
            default:
                System.out.println("Não é uma vogal");
        }

        System.out.println("A palavra possui " + palavra1.length() + " caracteres");

        if (palavra1.indexOf("-") > 0) {
            String pedacoAteTraco = palavra1.substring(0, palavra1.indexOf("-"));
            String pedacoAteFinal = palavra1.substring(palavra1.indexOf("-") + 1, palavra1.length());

            System.out.println(pedacoAteTraco);
            System.out.println(pedacoAteFinal);
        }  

        s.close();
    }

    public static void main(String[] args) {
        new ExemploString();
    }
}