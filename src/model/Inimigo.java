package model;

public class Inimigo {

	private int pos_x;
	private int pos_y;
	private boolean capturavel;
	private int tempo_captura;
	public int getPos_x() {
		return pos_x;
	}
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
	public int getPos_y() {
		return pos_y;
	}
	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	public boolean isCapturavel() {
		return capturavel;
	}
	public void setCapturavel(boolean capturavel) {
		this.capturavel = capturavel;
	}
	public int getTempo_captura() {
		return tempo_captura;
	}
	public void setTempo_captura(int tempo_captura) {
		this.tempo_captura = tempo_captura;
	}
	public Inimigo(int pos_x, int pos_y, boolean capturavel, int tempo_captura) {
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		this.capturavel = capturavel;
		this.tempo_captura = tempo_captura;
	}
	public Inimigo() {
		
	}
// teste diego	
}
