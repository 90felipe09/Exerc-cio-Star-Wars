package br.usp.ime.labpoo;

import java.util.List;
import java.util.ArrayList;

public class Missao {
	private String nomeMissao;
	private int dataMissao; //ano da missao
	private boolean sucesso; //0, se mal sucedida; 1, se bem sucedida
	
	private Ser mentorMissao; //quem elaborou a missao
	private List<Ser> envolvidos = new ArrayList<Ser>();
	
	public Missao (String nomeMissao, int dataMissao, boolean sucesso, Ser mentorMissao) {
		this.dataMissao = dataMissao;
		this.mentorMissao = mentorMissao;
		this.nomeMissao = nomeMissao;
		this.sucesso = sucesso;
	}

	public List<Ser> getEnvolvidos() {
		return this.envolvidos;
	}

	public void novoEnvolvido(Ser pessoa) {
		envolvidos.add(pessoa);
	}

	public String getNomeMissao() {
		return nomeMissao;
	}

	public void setNomeMissao(String nomeMissao) {
		this.nomeMissao = nomeMissao;
	}

	public int getDataMissao() {
		return dataMissao;
	}

	public void setDataMissao(int dataMissao) {
		this.dataMissao = dataMissao;
	}

	public boolean isSucesso() {
		return sucesso;
	}

	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}

	public Ser getMentorMissao() {
		return mentorMissao;
	}

	public void setMentorMissao(Ser mentorMissao) {
		this.mentorMissao = mentorMissao;
	}

	public void setEnvolvidos(List<Ser> envolvidos) {
		this.envolvidos = envolvidos;
	}
	
	
	
	
}
