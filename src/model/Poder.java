package model;

public class Poder {

	private char tipo_poder; //invisivel, invencivel, velocidade
	private int tempo;
	public char getTipo_poder() {
		return tipo_poder;
	}
	public void setTipo_poder(char tipo_poder) {
		this.tipo_poder = tipo_poder;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public Poder(char tipo_poder, int tempo) {
		this.tipo_poder = tipo_poder;
		this.tempo = tempo;
	}
	public Poder() {

	}
	
}
