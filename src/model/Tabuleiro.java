package model;

public class Tabuleiro {

	private int pontos_coleta;
	private int pos[][] = new int [10][20];
	
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
	
	public Tabuleiro(){
		
	}
	public Tabuleiro(int pontos_coleta, int[][] pos) {
		this.pontos_coleta = pontos_coleta;
		this.pos = pos;
	}
	

	
}
