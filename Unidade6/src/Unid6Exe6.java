import java.util.Scanner;

public class Unid6Exe6 {

    /*
     * Uni6Exe06.java - Faça um programa que leia um valor N inteiro. Com base neste
     * valor, crie um vetor do tipo real. Em seguida, solicite ao usuário informar
     * essa quantidade N de valores reais para popular o vetor. Após ter preenchido
     * o vetor, solicite que o usuário informe um outro valor real. Informe para o
     * usuário se este valor informado se encontra cadastrado no vetor. Faça um
     * método para ler o vetor e outro, que retorne verdadeiro ou falso, para
     * encontrar o valor.
     */
    public Unid6Exe6() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = s.nextInt();
        float numeros[] = new float[n];
        popular(numeros, s);

        System.out.print("Digite um número para busca: ");
        float numero = s.nextFloat();
        if (encontrarValor(numero, numeros)) {
            System.out.println("Encontrou o valor!");
        } else {
            System.out.println("Valor não encontrado");
        }
        s.close();
    }

    private boolean encontrarValor(float numero, float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            } 
        }
        return false;
    }

    private void popular(float[] vetor, Scanner leitor) {
        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.print("Digite um número real[" + posicao + "]: ");
            vetor[posicao] = leitor.nextFloat();
        }
    }

    public static void main(String[] args) {
        new Unid6Exe6();
    }
}