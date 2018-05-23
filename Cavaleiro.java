package br.usp.ime.labpoo;

public class Cavaleiro extends Padawan {
	private int anoCaval;
	//ano em que se tornou cavaleiro
	
	private Sabre sabre;
	
	public Cavaleiro(String nome, String genero, String especie, int ano, String planeta, double conc, 
			double paz, double raiva, boolean telepatia, boolean telecinese, boolean persuasao, Academia academia, 
			boolean cabelo, Mestre mestre, double conhecSabre, int anoCaval, Sabre sabre) {
		super(nome, genero, especie, ano, planeta, conc, paz, raiva, telepatia, telecinese, persuasao,
			academia, cabelo, mestre, conhecSabre);
		this.anoCaval = anoCaval;
		this.sabre = sabre;
	}
}
