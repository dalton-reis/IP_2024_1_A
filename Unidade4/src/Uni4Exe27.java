import java.util.Scanner;

public class Uni4Exe27 {
    public Uni4Exe27() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a hora de entrada (0 a 23): ");
        int horaEntrada = s.nextInt();
        System.out.print("Digite o minuto de entrada (0 a 59): ");
        int minEntrada = s.nextInt();
        System.out.print("Digite a hora de saída (0 a 23): ");
        int horaSaida = s.nextInt();
        System.out.print("Digite o minuto de saida (0 a 59): ");
        int minSaida = s.nextInt();

        if (horaEntrada >= 0 && horaEntrada <= 23) {
            if (horaSaida >= 0 && horaSaida <= 23) {
                if (horaSaida > horaEntrada ||
                        (horaSaida == horaEntrada && minSaida > minEntrada)) {
                    if (minEntrada >= 0 && minEntrada <= 59) {
                        if (minSaida >= 0 && minSaida <= 59) {

                            int duracao = horaSaida - horaEntrada;

                            if ((minSaida - minEntrada) >= 30) {
                                duracao += 1;
                            }
                            /*
                             * if (duracao == 0) {
                             * duracao++;
                             * }
                             */
                            float valorPagar = 0;
                            switch (duracao) {
                                default: // >= 5
                                    int horasMais = duracao - 4;
                                    valorPagar = 25 + (10 * horasMais);
                                case 4:
                                    valorPagar += 7.5f;
                                case 3:
                                    valorPagar += 7.5f;
                                case 2:
                                    valorPagar += 5;
                                case 1:
                                case 0:
                                    valorPagar += 5;                               

                            }

                            System.out.println("Duração em horas: " + duracao);
                            System.out.println("Valor a pagar: R$" + valorPagar);
                        } else {
                            System.out.println("Minuto de saída inválido: deve ser entre 0 e 59");
                        }
                    } else {
                        System.out.println("Minuto de entrada inválido: deve ser entre 0 e 59");
                    }
                } else {
                    System.out.println("Hora de saída deve ser depois da hora de entrada");
                }
            } else {
                System.out.println("Hora de saída inválida: deve ser entre 0 e 23");
            }
        } else {
            System.out.println("Hora de entrada inválida: deve ser entre 0 e 23");
        }

        s.close();
    }

    public static void main(String[] args) {
        new Uni4Exe27();
    }
}
