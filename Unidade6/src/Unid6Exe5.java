import java.util.Scanner;

public class Unid6Exe5 {
    
    public Unid6Exe5(){
        String perguntas[] = new String[5];
        // String pergunta[] = {"Gosta de música sertaneja?",
        // "Gosta de futebol?", "Gosta de seriados?"};
        // perguntas[0] = "...";
        // perguntas[1] = "....";
       
       

        Scanner s = new Scanner(System.in);
        lerPerguntas(s, perguntas);

        /*for (int i = 0; i < perguntas.length; i++) {
            System.out.print("Qual pergunta? ");
            perguntas[i] = s.nextLine();
        }*/
        //char respostaMoca[] = new char[5];
       // char respostaRapaz[] = new char[5];
        /*System.out.println("Inicio das respostas do rapaz:");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + 
                " (Sim, Nao ou Ind): ");
            respostaRapaz[i] = s.nextLine().trim().toUpperCase().charAt(0);

        }*/
        char respostaRapaz[] = popularRespostas(s, 
                perguntas, "rapaz");  
        char respostaMoca[] = popularRespostas(s, 
                    perguntas, "moca");

        /*System.out.println("Inicio das respostas da moça:");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + 
                " (Sim, Nao ou Ind): ");
            respostaMoca[i] = s.nextLine().trim().toUpperCase().charAt(0);

        }*/
        /*int indice = 0;
        for (int i = 0; i < respostaMoca.length; i++) {
            if (respostaMoca[i] == respostaRapaz[i]) {
                indice += 3;
            } else if ((respostaMoca[i] == 'S' &&
                        respostaRapaz[i] == 'N') ||
                        (respostaMoca[i] == 'N') &&
                        respostaRapaz[i] == 'S') {
                            indice -= 2;
            } else {
                indice += 1;
            }
        }*/

        int indice = calcularIndice(respostaRapaz, respostaMoca);
        if (indice == 15) {
            System.out.println("Casem ");
        } else if (indice >= 10 && indice <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (indice >= 5 && indice <= 9) {
            System.out.println("Vale um encontro.");
        } else if (indice >= 0 && indice <= 4) {
            System.out.println("Talvez não dê certo :(");
        } else if (indice >= -9 && indice <= -1) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
            
        

        s.close();
    }


    public void lerPerguntas(Scanner scanner, String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Qual pergunta? ");
            vetor[i] = scanner.nextLine();
        }
    }
    public int calcularIndice(char[] v1, char[] v2) {
        int indice = 0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i]) {
                indice += 3;
            } else if ((v1[i] == 'S' &&
                        v2[i] == 'N') ||
                        (v1[i] == 'N') &&
                        v2[i] == 'S') {
                            indice -= 2;
            } else {
                indice += 1;
            }
        }
        return indice;
    }
    public char[] popularRespostas(Scanner s, 
            String[] perguntas, String nome) {
        char[] respostas = new char[5];
        System.out.println("Inicio das respostas " +
         "do(a) " + nome);
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + 
                " (Sim, Nao ou Ind): ");
            respostas[i] = s.nextLine().trim().toUpperCase().charAt(0);
        }
        return respostas;
    }
    public static void main(String[] args) {
        new Unid6Exe5();
    }
}
