package br.usp.ime.labpoo;

public class Habilidade {
	private String nome;
	private tipodehabilidade tipo;
	private int dano;
	
	enum tipodehabilidade
	{
		sabre,forca;
	}

	public Habilidade(String nome, tipodehabilidade tipo, int dano) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.dano = dano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public tipodehabilidade getTipo() {
		return tipo;
	}

	public void setTipo(tipodehabilidade tipo) {
		this.tipo = tipo;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}
	
}
