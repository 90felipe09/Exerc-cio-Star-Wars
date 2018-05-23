package br.usp.ime.labpoo;

public class Sith extends Ser{
	private String apelido; //novo nome assumido
	
	private boolean telepatia;
	private boolean telecinese;  //0, se nao tiver tal poder; 1, se tiver
	private boolean persuasao;
	
	//eh necessario um metodo para aumentar o percentual de raiva
	
	private Academia academia;
	//academia
	
	public Sith (String nome, String genero, String especie, int ano, String planeta, double conc, double paz,
			double raiva, String apelido, boolean telepatia, boolean telecinese, boolean persuasao, Academia academia) {
		super (nome, genero, especie, ano, planeta, conc, paz, raiva);
		this.apelido = apeido;
		this.telepatia = telepatia;
		this.telecinese = telecinese;
		this.persuasao = persuasao;
		this.academia = academia;
	}

	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public boolean isTelepatia() {
		return telepatia;
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

}
