import java.util.Scanner;

public class Jogador {
	private MapaJogoVelha mapa;
	private char letra;

	public Jogador(MapaJogoVelha mapa) {
		setMapa(mapa);
		setLetra('X');
	}
	public boolean joga(Scanner teclado) {
		boolean jogadaValida = false;
		while (!jogadaValida) {
			System.out.print("Linha:  ");
			int linha = teclado.nextInt();
			System.out.print("Coluna: ");
			int coluna = teclado.nextInt();
			if (mapa.jogar(linha, coluna, letra)) {
				mapa.jogar(linha, coluna, letra);
				jogadaValida = true;
			} else {
				System.out.println("Célula inválida!");
			}
		}
		return true;
	}

	public char getLetra() {
		return letra;
	}

	public  void setLetra(char letra) {
		this.letra = letra;
	}

	public MapaJogoVelha getMapa() {
		return mapa;
	}

	public void setMapa(MapaJogoVelha mapa) {
		this.mapa = mapa;
	}
}
