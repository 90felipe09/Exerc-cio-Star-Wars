package br.usp.ime.labpoo;

public class Padawan extends Jedi {
	private boolean cabelo; //0 se nao tem cabelo; 1 se tem tranca
	private Mestre mestre;
	
	public Padawan(String nome, String genero, String especie, int anoNasc, String planetaNatal, int dominioDaForca,
			int dominioDoSabre, int pontosDeVida, Habilidade[] habilidades, double concMidiChlor, double percPazInterna,
			double percRaiva, boolean telepatia, boolean telecinese, boolean persuasao, Academia academia,
			boolean cabelo, Mestre mestre) {
		super(nome, genero, especie, anoNasc, planetaNatal, dominioDaForca, dominioDoSabre, pontosDeVida, habilidades,
				concMidiChlor, percPazInterna, percRaiva, telepatia, telecinese, persuasao, academia);
		this.cabelo = cabelo;
		this.mestre = mestre;
	}
	
	public boolean isCabelo() {
		return cabelo;
	}
	public void setCabelo(boolean cabelo) {
		this.cabelo = cabelo;
	}
	public Mestre getMestre() {
		return mestre;
	}
	public void setMestre(Mestre mestre) {
		this.mestre = mestre;
	}
	

	
}
