public class Unid5Exe10 {
    /*
     * O número 3025 possui a seguinte característica:
     * 
     * 30+25=55 | 55^2=3025
     * 
     * Escreva um programa que pesquise e imprima os 10 primeiros 
     * números naturais
     * que apresentam tal propriedade. Outros exemplos:
     * 
     * 20+25=45 45^2=2025
     */
    public Unid5Exe10() {

        for (int i = 1; i <= 9999; i++) {
            for (int j = 1; j <= 9999; j++) {
                int soma = i + j;
                int somaQuadrado = soma * soma;
                String concatenacao = String.valueOf(i) + String.valueOf(j);
                                    //i + "" + j;
                if (String.valueOf(somaQuadrado).equals(concatenacao)) {
                    System.out.println(i + " + " + j + " " + soma + "^2 = " + somaQuadrado);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Unid5Exe10();
    }
}