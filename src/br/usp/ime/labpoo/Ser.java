package br.usp.ime.labpoo;

public class Ser {
	private String nome;
	private String genero;
	private String especie;
	private int anoNasc;
	private String planetaNatal;
	private int dominioDaForca;
	private int dominioDoSabre;
	private int pontosDeVida;
	private Habilidade[] habilidades = new Habilidade[4];
	
	private double concMidiChlor;
	//armazena a concentracao de midi-chlorians do ser
	//se for alta, pode aderir a classe Jedi ou Sith
	
	private double percPazInterna;
	private double percRaiva;
	
	//existem seres que nao sao nem Jedi, nem Sith
	//assim, Ser nao pode ser classe abstrata; tem objetos
	
	public Ser(String nome, String genero, String especie, int anoNasc, String planetaNatal, int dominioDaForca,
			int dominioDoSabre, int pontosDeVida, Habilidade[] habilidades, double concMidiChlor, double percPazInterna,
			double percRaiva) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.especie = especie;
		this.anoNasc = anoNasc;
		this.planetaNatal = planetaNatal;
		this.dominioDaForca = dominioDaForca;
		this.dominioDoSabre = dominioDoSabre;
		this.pontosDeVida = pontosDeVida;
		this.habilidades = habilidades;
		this.concMidiChlor = concMidiChlor;
		this.percPazInterna = percPazInterna;
		this.percRaiva = percRaiva;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public String getPlanetaNatal() {
		return planetaNatal;
	}

	public void setPlanetaNatal(String planetaNatal) {
		this.planetaNatal = planetaNatal;
	}

	public int getDominioDaForca() {
		return dominioDaForca;
	}

	public void setDominioDaForca(int dominioDaForca) {
		this.dominioDaForca = dominioDaForca;
	}

	public int getDominioDoSabre() {
		return dominioDoSabre;
	}

	public void setDominioDoSabre(int dominioDoSabre) {
		this.dominioDoSabre = dominioDoSabre;
	}

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public Habilidade[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidade[] habilidades) {
		this.habilidades = habilidades;
	}
	
}
