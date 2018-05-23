package br.usp.ime.labpoo;

public class Missao {
	private String nomeMissao;
	private int dataMissao; //ano da missao
	private boolean sucesso; //0, se mal sucedida; 1, se bem sucedida
	
	private Ser mentorMissao; //quem elaborou a missao
	private Ser envolvidos[];
	
	private int i = 0;
	
	public Missao (String nomeMissao, int dataMissao, boolean sucesso, Ser mentorMissao) {
		this.dataMissao = dataMissao;
		this.mentorMissao = mentorMissao;
		this.nomeMissao = nomeMissao;
		this.sucesso = sucesso;
	}

	public Ser[] getEnvolvidos() {
		return envolvidos;
	}

	public void novoEnvolvido(Ser pessoa) {
		envolvidos[i] = pessoa;
		i++;
	}
}
