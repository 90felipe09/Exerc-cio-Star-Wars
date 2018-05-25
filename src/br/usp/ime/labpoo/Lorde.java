package br.usp.ime.labpoo;

public class Lorde extends Aprendiz {
	private Sabre sabre;

	public Lorde(String nome, String genero, String especie, int anoNasc, String planetaNatal, int dominioDaForca,
			int dominioDoSabre, int pontosDeVida, Habilidade[] habilidades, double concMidiChlor, double percPazInterna,
			double percRaiva, String apelido, boolean telepatia, boolean telecinese, boolean persuasao,
			Academia academia, double conhecSabre, Lorde treinador, Sabre sabre) {
		super(nome, genero, especie, anoNasc, planetaNatal, dominioDaForca, dominioDoSabre, pontosDeVida, habilidades,
				concMidiChlor, percPazInterna, percRaiva, apelido, telepatia, telecinese, persuasao, academia,
				conhecSabre, treinador);
		this.sabre = sabre;
	}

	public Sabre getSabre() {
		return sabre;
	}

	public void setSabre(Sabre sabre) {
		this.sabre = sabre;
	}
	
	
}
