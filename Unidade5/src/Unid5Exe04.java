public class Unid5Exe04 {
    public Unid5Exe04() {
        
        double s = 0;
        int numerador = 3;
        double denominador = 2;
        int auxiliar = 2;
        for (int i = 1; i <= 20; i++) {
            System.out.println(numerador + "/" + denominador);
            s += (numerador/denominador);

            numerador += 2;
            auxiliar += 2;
            denominador += auxiliar;
            
        }
        System.out.println("Soma = " + s);
    }

    public static void main(String[] args) {
        new Unid5Exe04();
    }
}
