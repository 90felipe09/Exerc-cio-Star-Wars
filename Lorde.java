package br.usp.ime.labpoo;

public class Lorde extends Aprendiz {
	private Sabre sabre;
	
	public Lorde(String nome, String genero, String especie, int ano, String planeta, double conc, 
			double paz,	double raiva, String apelido, boolean telepatia, boolean telecinese, 
			boolean persuasao, Academia academia, double conhecSabre, Lorde treinador, Sabre sabre) {
		super(nome, genero, especie, ano, planeta, conc, paz, raiva, apelido, telepatia, telecinese, persuasao, academia, conhecSabre, treinador);
		this.sabre = sabre;
	}
}
