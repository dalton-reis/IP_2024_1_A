public class Exemplo {
    public static void main(String[] args) {
       int prod = 1;
		int somaProd = 1;

		System.out.println("Hora[1] " + somaProd);
		for (int hora = 1; hora < 16; hora++) {
			prod *= 3;
			somaProd += prod;
			System.out.println("Hora[" + (hora + 1) + "] " + somaProd);
		}
    }
}
