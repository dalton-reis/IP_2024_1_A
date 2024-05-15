import java.util.Scanner;

public class Uni5Exe09 {
    /*
     * Uma turma tem n alunos. Dado n, o nome e idade de cada aluno 
     * descreva um algoritmo que:
     * 
     * escreva os nomes dos alunos que tem 18 anos;
     * escreva a quantidade de alunos que tem idade acima de 20 anos.
     */
    public Uni5Exe09() {
        Scanner s = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int n = s.nextInt();

        int quantidadeMaior20 = 0;
        String alunos18Anos = "";
        for (int i = 0 ; i < n; i++) {
            System.out.print("Nome do aluno: ");
            String nome = s.next();
            System.out.print("Idade do aluno: ");
            int idade = s.nextInt();

            if (idade == 18) {
                alunos18Anos += nome + "\n";
            } else if (idade > 20) {
                quantidadeMaior20++;
            }

        }
        System.out.println();
        System.out.println("Alunos com 18 anos:\n " + alunos18Anos);
        System.out.println("Quantidade de alunos com mais de 20 anos: " + quantidadeMaior20);


        s.close();

    }

    public static void main(String[] args) {
        new Uni5Exe09();
    }
}
