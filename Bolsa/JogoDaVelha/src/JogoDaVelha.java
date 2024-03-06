import java.util.Scanner;

public class JogoDaVelha {

	private MapaJogoVelha mapa;
	private JogadorPc jogadorPC;
	private Jogador jogadorJogador;

	public JogoDaVelha() {
		mapa = new MapaJogoVelha();
		jogadorPC = new JogadorPc(mapa);
		jogadorJogador = new Jogador(mapa);

		Scanner teclado = new Scanner(System.in);
		boolean jogar = true;
		int qtdJogadas = 1;
		boolean primeiraVez = true;
		while (jogar == true) {
			String resposta = "s";
			if (!primeiraVez) {
				System.out.println("Deseja jogar novamente? s/n");
				resposta = teclado.next();
			}

			if (resposta.equals("s")) {
				jogar(teclado, qtdJogadas, primeiraVez);
			} else {
				jogar = false;
			}
			primeiraVez = false;
		}
	}

	private void jogar(Scanner teclado, int qtdJogadas, boolean primeiraVez) {
		mapa.limpaMapa();
		boolean acabou = false;
		boolean vezDoJogador;
		int sortear = (int) (Math.random() * 10 + 1);
		if (sortear > 5) {
			System.out.println("O computador joga primeiro");
			vezDoJogador = false;
		} else {
			System.out.println("Você joga primeiro");
			vezDoJogador = true;
		}
		while (!acabou) {
			mapa.desenha(qtdJogadas, acabou);
			qtdJogadas++;
			if (vezDoJogador) {
				System.out.println("(Você)");
				jogadorJogador.joga(teclado);
			} else {
				System.out.println("(PC)");
				jogadorPC.joga();
			}
			vezDoJogador = !vezDoJogador;
			primeiraVez = false;
			if (mapa.ganhou(jogadorJogador.getLetra())) {
				acabou = true;
				mapa.desenha(qtdJogadas, acabou);
				System.out.println("Você venceu!");
			} else if (mapa.ganhou(jogadorPC.getLetra())) {
				acabou = true;
				mapa.desenha(qtdJogadas, acabou);
				System.out.println("O computador venceu");
			} else if (mapa.empatou()) {
				acabou = true;
				mapa.desenha(qtdJogadas, acabou);
				System.out.println("Empatou :/");
			}
		}
	}

	public static void main(String[] args) {
		new JogoDaVelha();
	}

}
