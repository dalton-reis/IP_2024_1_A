public class Unid5Exe3 {

    public Unid5Exe3() {
        float soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma = soma + 1f/i;
            System.out.print("1/"+i + ", ");
        }
        System.out.println();
        System.out.println("Soma = " + soma);
    }


    public static void main(String[] args) {
        new Unid5Exe3();
    }
}
