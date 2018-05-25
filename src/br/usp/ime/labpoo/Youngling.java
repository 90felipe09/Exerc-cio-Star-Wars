package br.usp.ime.labpoo;

public class Youngling extends Jedi {
	private Cla cla;
	private double colheita; //porcentagem ja realizada da colheita

	public Youngling(String nome, String genero, String especie, int anoNasc, String planetaNatal, int dominioDaForca,
			int dominioDoSabre, int pontosDeVida, Habilidade[] habilidades, double concMidiChlor, double percPazInterna,
			double percRaiva, boolean telepatia, boolean telecinese, boolean persuasao, Academia academia, Cla cla,
			double colheita) {
		super(nome, genero, especie, anoNasc, planetaNatal, dominioDaForca, dominioDoSabre, pontosDeVida, habilidades,
				concMidiChlor, percPazInterna, percRaiva, telepatia, telecinese, persuasao, academia);
		this.cla = cla;
		this.colheita = colheita;
	}

	public Cla getCla() {
		return cla;
	}

	public void setCla(Cla cla) {
		this.cla = cla;
	}

	public double getColheita() {
		return colheita;
	}

	public void setColheita(double colheita) {
		this.colheita = colheita;
	}
	
}
