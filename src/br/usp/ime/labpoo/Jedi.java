package br.usp.ime.labpoo;

import java.util.Random;

public class Jedi extends Ser{
	private boolean telepatia;
	private boolean telecinese;  //0, se nao tiver tal poder; 1, se tiver
	private boolean persuasao;
	public static Random random = new Random();
	
	//eh necessario um metodo para aumentar o percentual de paz interna
	
	private Academia academia;
	//academia
	
	public boolean isTelepatia() {
		return telepatia;
	}
	public Jedi(String nome, String genero, String especie, int anoNasc, String planetaNatal, int dominioDaForca,
			int dominioDoSabre, int pontosDeVida, Habilidade[] habilidades, double concMidiChlor, double percPazInterna,
			double percRaiva, boolean telepatia, boolean telecinese, boolean persuasao, Academia academia) {
		super(nome, genero, especie, anoNasc, planetaNatal, dominioDaForca, dominioDoSabre, pontosDeVida, habilidades,
				concMidiChlor, percPazInterna, percRaiva);
		this.telepatia = telepatia;
		this.telecinese = telecinese;
		this.persuasao = persuasao;
		this.academia = academia;
	}
	public Jedi() 
	{
		
		super(
				NomesAleatorios.getNomeJedi(),
				NomesAleatorios.getGenero(),
				NomesAleatorios.getEspecies(),
				random.nextInt(150),
				NomesAleatorios.getPlanetas(),
				random.nextInt(50),
				random.nextInt(50),
				random.nextInt(200) + 200,
				NomesAleatorios.getListaHabilidadesJedi(),
				random.nextInt(), 
				random.nextInt(100), 
				random.nextInt(100));
		
		this.telepatia = random.nextBoolean();
		this.telecinese = random.nextBoolean();
		this.persuasao = random.nextBoolean();
	}
	
	public void setTelepatia(boolean telepatia) {
		this.telepatia = telepatia;
	}

	public boolean isTelecinese() {
		return telecinese;
	}
	public void setTelecinese(boolean telecinese) {
		this.telecinese = telecinese;
	}

	public boolean isPersuasao() {
		return persuasao;
	}
	public void setPersuasao(boolean persuasao) {
		this.persuasao = persuasao;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	
}
