package br.usp.ime.labpoo;

public class Sabre {
	private String tipo; //espada, lanca...
	private String cristal;
	private String corLamina;
	private Ser dono;
	
	public Sabre(String tipo, String cristal, String corLamina, Ser dono) {
		super();
		this.tipo = tipo;
		this.cristal = cristal;
		this.corLamina = corLamina;
		this.dono = dono;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCristal() {
		return cristal;
	}
	public void setCristal(String cristal) {
		this.cristal = cristal;
	}
	public String getCorLamina() {
		return corLamina;
	}
	public void setCorLamina(String corLamina) {
		this.corLamina = corLamina;
	}
	public Ser getDono() {
		return dono;
	}
	public void setDono(Ser dono) {
		this.dono = dono;
	}
	

}
