package br.usp.ime.labpoo;

public class Padawan extends Jedi {
	private boolean cabelo; //0 se nao tem cabelo; 1 se tem tranca
	private Mestre mestre;
	private double conhecSabre; //porcentagem de conhecimento para construir seu sabre
	
	public Padawan(String nome, String genero, String especie, int ano, String planeta, double conc, 
			double paz, double raiva, boolean telepatia, boolean telecinese, boolean persuasao, Academia academia, 
			boolean cabelo, Mestre mestre, double conhecSabre) {
		super(nome, genero, especie, ano, planeta, conc, paz, raiva, telepatia, telecinese, persuasao, academia);
		this.cabelo = cabelo;
		this.mestre = mestre;
		this.conhecSabre = conhecSabre;
	}

	public boolean isCabelo() {
		return cabelo;
	}
	public void setCabelo(boolean cabelo) {
		this.cabelo = cabelo;
	}

	public double getConhecSabre() {
		return conhecSabre;
	}
	public void setConhecSabre(double conhecSabre) {
		this.conhecSabre = conhecSabre;
	}
	
	
}
