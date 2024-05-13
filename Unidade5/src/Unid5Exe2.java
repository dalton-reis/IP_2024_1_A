public class Unid5Exe2 {

    /*
     * Descreva um algoritmo que calcule e escreva a soma dos números
     * pares e a soma dos números ímpares entre 1 e 100.
     */
    public Unid5Exe2() {

       int somaPar = 0;
       int somaImpar = 0;
       for (int numero = 1; numero <= 100; numero++) { //numeros de 1 até 100
            if (numero % 2 == 0 ) {
                somaPar += numero;
            } else {
                somaImpar += numero;
            }
       } 
       System.out.println("Soma dos pares = "  +somaPar);
       System.out.println("Soma dos ímpares = "  +somaImpar);
    }

    public static void main(String[] args) {
        new Unid5Exe2();
    }
}
