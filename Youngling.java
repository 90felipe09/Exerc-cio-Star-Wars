package br.usp.ime.labpoo;

public class Youngling extends Jedi {
	private Cla cla;
	private double colheita; //porcentagem ja realizada da colheita
	
	public Youngling (String nome, String genero, String especie, int ano, String planeta, double conc, 
			double paz, double raiva, boolean telepatia, boolean telecinese, boolean persuasao, 
			Academia academia, Cla cla, double colheita) {
		super(nome, genero, especie, ano, planeta, conc, paz, raiva, telepatia, telecinese, persuasao, academia);
		this.cla = cla;
		this.colheita = colheita;
	}

	public double getColheita() {
		return colheita;
	}
	public void setColheita(double colheita) {
		this.colheita = colheita;
	}
	
	
}
