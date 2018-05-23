package br.usp.ime.labpoo;

public class Mestre extends Cavaleiro {
	private double campoVidencia;
	private double imortalidade;

	public Mestre(String nome, String genero, String especie, int anoNasc, String planetaNatal, int dominioDaForça,
			int dominioDoSabre, int pontosDeVida, Habilidade[] habilidades, double concMidiChlor, double percPazInterna,
			double percRaiva, boolean telepatia, boolean telecinese, boolean persuasao, Academia academia,
			boolean cabelo, Mestre mestre, int anoCaval, Sabre sabre, double campoVidencia, double imortalidade) {
		super(nome, genero, especie, anoNasc, planetaNatal, dominioDaForça, dominioDoSabre, pontosDeVida, habilidades,
				concMidiChlor, percPazInterna, percRaiva, telepatia, telecinese, persuasao, academia, cabelo, mestre,
				anoCaval, sabre);
		this.campoVidencia = campoVidencia;
		this.imortalidade = imortalidade;
	}
	public double getCampoVidencia() {
		return campoVidencia;
	}
	public void setCampoVidencia(double campoVidencia) {
		this.campoVidencia = campoVidencia;
	}

	public double getImortalidade() {
		return imortalidade;
	}
	public void setImortalidade(double imortalidade) {
		this.imortalidade = imortalidade;
	}
	
	
}
