package br.usp.ime.labpoo;

public class Mestre extends Cavaleiro {
	private double campoVidencia;
	private double imortalidade;
	
	public Mestre(String nome, String genero, String especie, int ano, String planeta, double conc, 
			double paz, double raiva, boolean telepatia, boolean telecinese, boolean persuasao,
			Academia academia, boolean cabelo, Mestre mestre, double conhecSabre, int anoCaval, Sabre sabre, double campoVidencia, double imortalidade) {
		super(nome, genero, especie, ano, planeta, conc, paz, raiva, telepatia, telecinese, persuasao,
				academia, cabelo, mestre, conhecSabre, anoCaval, sabre);
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
