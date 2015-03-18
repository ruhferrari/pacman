package model;

public class Tabuleiro {

	private int pontos_coleta;
	private int pos[][] = new int[10][20];

	public int getPontos_coleta() {
		return pontos_coleta;
	}

	public void setPontos_coleta(int pontos_coleta) {
		this.pontos_coleta = pontos_coleta;
	}

	public int[][] getPos() {
		return pos;
	}

	public void setPos(int pos[][]) {
		this.pos = pos;
	}

	public Tabuleiro() {

	}

	public Tabuleiro(int pontos_coleta, int[][] pos) {
		this.pontos_coleta = pontos_coleta;
		this.pos = pos;
	}

	public void iniciarTabuleiro() {
		System.out.println("PACMAN começou!");
		System.out.println();

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 20; coluna++) {
				if (linha == 1 || linha == 3 || linha == 6 || linha == 8) {
					if (coluna == 0 || coluna == 19) {
						System.out.printf(" # ", pos[linha][coluna]);
					} else
						System.out.printf(" * ", pos[linha][coluna]);
				} else if ((linha == 2 || linha == 4 || linha == 5 || linha == 7)
						&& (coluna == 1 || coluna == 6 || coluna == 13 || coluna == 18)) {
					System.out.printf(" * ", pos[linha][coluna]);
				} else
					System.out.printf(" # ", pos[linha][coluna]);
			}

			System.out.println();
		}
	}

	public void renderizarTabuleiro(int linhaJogo, int colunaJogo,
			String caracter) {
		limpaTela();
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 20; coluna++) {
				if (linha == 1 || linha == 3 || linha == 6 || linha == 8) {
					if (coluna == 0 || coluna == 19) {
						System.out.printf(" # ", pos[linha][coluna]);
					} else if (coluna == colunaJogo && linha == linhaJogo) {
						System.out.printf(caracter, pos[linhaJogo][colunaJogo]);
					} else
						System.out.printf(" * ", pos[linha][coluna]);
				} else if ((linha == 2 || linha == 4 || linha == 5 || linha == 7)
						&& (coluna == 1 || coluna == 6 || coluna == 13 || coluna == 18)) {
					System.out.printf(" * ", pos[linha][coluna]);
				} else
					System.out.printf(" # ", pos[linha][coluna]);
			}

			System.out.println();
		}
	}

	public void limpaTela() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}

	}
}
