package model;
import model.Poder;
public class Personagem {

	private int vida;
	private int pos[][];
	private Poder poder;
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int[][] getPos() {
		return pos;
	}
	public void setPos(int pos[][]) {
		this.pos = pos;
	}
	
	public Poder getPoder() {
		return poder;
	}
	public void setPoder(Poder poder) {
		this.poder = poder;
	}
	public Personagem(int vida, int[][] pos, Poder poder) {
		this.vida = vida;
		this.pos = pos;
		this.poder = poder;
	}
	public Personagem() {

	}
	
}
