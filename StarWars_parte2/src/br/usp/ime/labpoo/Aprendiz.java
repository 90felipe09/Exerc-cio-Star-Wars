package br.usp.ime.labpoo;

public class Aprendiz extends Sith {
	private double conhecSabre; //porcentagem de conhecimento para construir o sabre
	private Lorde treinador;
	
	public Aprendiz(String nome, String genero, String especie, int anoNasc, String planetaNatal, int dominioDaForca,
			int dominioDoSabre, int pontosDeVida, Habilidade[] habilidades, double concMidiChlor, double percPazInterna,
			double percRaiva, String apelido, boolean telepatia, boolean telecinese, boolean persuasao,
			Academia academia, double conhecSabre, Lorde treinador) {
		super(nome, genero, especie, anoNasc, planetaNatal, dominioDaForca, dominioDoSabre, pontosDeVida, habilidades,
				concMidiChlor, percPazInterna, percRaiva, apelido, telepatia, telecinese, persuasao, academia);
		this.conhecSabre = conhecSabre;
		this.treinador = treinador;
	}
	
	public double getConhecSabre() {
		return conhecSabre;
	}
	public void setConhecSabre(double conhecSabre) {
		this.conhecSabre = conhecSabre;
	}

	public Lorde getTreinador() {
		return treinador;
	}

	public void setTreinador(Lorde treinador) {
		this.treinador = treinador;
	}
	
	
}
