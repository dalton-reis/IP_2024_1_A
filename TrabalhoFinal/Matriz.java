import java.util.Scanner;

public class Matriz {
    

    public Matriz() {
        int[][] numeros = new int[3][2];

        numeros[0][0] = 5;

        //Popular valores:
        Scanner s = new Scanner(System.in);
        for (int lin = 0; lin < numeros.length; lin++) {
            for (int col = 0; col < numeros[lin].length; col++) {
                System.out.print("Número[" + lin +"]["+col+"]:");
                numeros[lin][col] = s.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++) { //linhas
            for (int j = 0; j < numeros[0].length; j++) { //colunas
                 System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
        s.close();
    }


    public static void main(String[] args) {
        new Matriz();    
    }
}
