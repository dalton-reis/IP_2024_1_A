public class JogadorPc {
	private MapaJogoVelha mapa;
	private char letra;

	public JogadorPc(MapaJogoVelha mapa) {
		setMapa(mapa);
		setLetra('O');
	}

	public boolean joga() {
		boolean jogadaValida = false;
		int linha = 0;
		int coluna = 0;
		while (!jogadaValida) {
			linha = mapa.sortear(0, 3);
			coluna = mapa.sortear(0, 3);

			if (mapa.jogar(linha, coluna, letra)) {
				mapa.jogar(linha, coluna, letra);
				jogadaValida = true;
			}
		}
		System.out.println("PC[" + linha + "," + coluna + "]");
		return true;
	}

	public MapaJogoVelha getMapa() {
		return mapa;
	}

	public void setMapa(MapaJogoVelha mapa) {
		this.mapa = mapa;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
}
