package br.usp.ime.labpoo;

public class Cavaleiro extends Padawan {
	private int anoCaval;
	//ano em que se tornou cavaleiro
	
	private Sabre sabre;

	public Cavaleiro(String nome, String genero, String especie, int anoNasc, String planetaNatal, int dominioDaForca,
			int dominioDoSabre, int pontosDeVida, Habilidade[] habilidades, double concMidiChlor, double percPazInterna,
			double percRaiva, boolean telepatia, boolean telecinese, boolean persuasao, Academia academia,
			boolean cabelo, Mestre mestre, int anoCaval, Sabre sabre) {
		super(nome, genero, especie, anoNasc, planetaNatal, dominioDaForca, dominioDoSabre, pontosDeVida, habilidades,
				concMidiChlor, percPazInterna, percRaiva, telepatia, telecinese, persuasao, academia, cabelo, mestre);
		this.anoCaval = anoCaval;
		this.sabre = sabre;
	}

	public int getAnoCaval() {
		return anoCaval;
	}

	public void setAnoCaval(int anoCaval) {
		this.anoCaval = anoCaval;
	}

	public Sabre getSabre() {
		return sabre;
	}

	public void setSabre(Sabre sabre) {
		this.sabre = sabre;
	}
	
	
}
