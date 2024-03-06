public class MapaJogoVelha {

	private char[][] mapa;

	public MapaJogoVelha() {
		mapa = new char[3][3];
	}

	public int sortear(int inicio, int fim) {
		return (int) (Math.random() * 3);
	}

	public void limpaMapa() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mapa[i][j] = ' ';
			}
		}
	}

	public void desenha(int jogada, boolean acabou) {
		System.out.println("---------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j < 2)
					System.out.print("| " + mapa[i][j] + " |");
				else
					System.out.println("| " + mapa[i][j] + " |");
			}
			System.out.println("---------------");
		}
		if (jogada != 0 && !acabou)
			System.out.print("Jogada " + jogada + ": ");
	}

	public boolean jogar(int l, int c, char jogador) {
		if ((l >= 0 && l < 3) && (c >= 0 && c < 3))
			if (mapa[l][c] == ' ') {// testa se a célula tá livre
				mapa[l][c] = jogador;
				return true;
			}
		return false;
	}

	public boolean ganhou(char jogador) {
		for (int i = 0; i < 3; i++) {
			if (mapa[i][0] == jogador && mapa[i][1] == jogador && mapa[i][2] == jogador)
				return true;
			for (int j = 0; j < 3; j++) {
				if (mapa[0][j] == jogador && mapa[1][j] == jogador && mapa[2][j] == jogador)
					return true;
			}
		}
		if (mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador)
			return true;
		if (mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador)
			return true;

		return false;
	}

	public boolean empatou() {
		boolean empate = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (mapa[i][j] == ' ') {
					empate = false;
				}
			}
		}
		return empate;
	}
}
