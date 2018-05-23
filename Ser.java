package br.usp.ime.labpoo;

public class Ser {
	private String nome;
	private String genero;
	private String especie;
	private int anoNasc;
	private String planetaNatal;
	
	private double concMidiChlor;
	//armazena a concentracao de midi-chlorians do ser
	//se for alta, pode aderir a classe Jedi ou Sith
	
	private double percPazInterna;
	private double percRaiva;
	
	//existem seres que nao sao nem Jedi, nem Sith
	//assim, Ser nao pode ser classe abstrata; tem objetos
	
	public Ser(String nome, String genero, String especie, int ano, String planeta, double conc, double paz, double raiva) {
		this.nome = nome;
		this.genero = genero;
		this.especie = especie;
		anoNasc = ano;
		planetaNatal = planeta;
		concMidiChlor = conc;
		percPazInterna = paz;
		percRaiva = raiva;
	}
	
	public double getPercPazInterna() {
		return percPazInterna;
	}
	public void setPercPazInterna(double p) {
		percPazInterna = p;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getConcMidiChlor() {
		return concMidiChlor;
	}
	public void setConcMidiChlor(double concMidiChlor) {
		this.concMidiChlor = concMidiChlor;
	}

	public double getPercRaiva() {
		return percRaiva;
	}
	public void setPercRaiva(double percRaiva) {
		this.percRaiva = percRaiva;
	}
	
}
