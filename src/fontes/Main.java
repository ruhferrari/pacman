package fontes;

import model.Personagem;
import model.Tabuleiro;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro();
		Personagem pacman = new Personagem();
		tab.iniciarTabuleiro();
		//pacman.nascer();
		tab.renderizarTabuleiro(6, 9, " c ");
	}

}
