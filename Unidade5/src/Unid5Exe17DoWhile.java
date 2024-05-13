import java.util.Scanner;

public class Unid5Exe17DoWhile {
    /*
     * Descreva um algoritmo que leia o número de inscrição e a
     * altura de um atleta em uma competição e informe:
     * 
     * o número de inscrição e a altura do atleta mais alto;
     * o número de inscrição e a altura do atleta mais baixo;
     * a altura média do grupo de atletas.
     * A leitura deve ser finalizada ao digitar 0 para o número de
     * inscrição.
     * 
     * COM CERTEZA TERÁ UM ATLETA:
     */
    public Unid5Exe17DoWhile() {
        Scanner s = new Scanner(System.in);
        int alturaAlta = Integer.MIN_VALUE;
        int alturaBaixa = Integer.MAX_VALUE;
        int inscricaoAlta = 0;
        int inscricaoBaixa = 0;
        int somaAlturas = 0;
        int quantidadeAtletas = 0;
        int inscricaoInformada = 0;
        do {
            System.out.print("Digite a inscrição do atleta: ");
            inscricaoInformada = s.nextInt();

            if (inscricaoInformada != 0) {
                System.out.print("Digite a altura do atleta (cm): ");
                int alturaInformada = s.nextInt();

                if (alturaInformada > alturaAlta) {
                    alturaAlta = alturaInformada;
                    inscricaoAlta = inscricaoInformada;
                }
                if (alturaInformada < alturaBaixa) {
                    alturaBaixa = alturaInformada;
                    inscricaoBaixa = inscricaoInformada;
                }

                somaAlturas += alturaInformada;
                quantidadeAtletas++;
            }
        } while (inscricaoInformada != 0);

        // Saídas:

        System.out.println("O atleta mais alto é " + inscricaoAlta +
                " com altura " + alturaAlta);
        System.out.println("O atleta mais baixo é " + inscricaoBaixa +
                " com altura " + alturaBaixa);

        float media = (somaAlturas / (float) quantidadeAtletas);
        System.out.println("A média das alturas é " + media);

        s.close();
    }

    public static void main(String[] args) {
        new Unid5Exe17DoWhile();
    }
}
