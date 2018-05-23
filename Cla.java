package br.usp.ime.labpoo;

import java.util.List;
import java.util.ArrayList;

public class Cla {
	private String nomeCla;
	private Mestre mestre;
	private int anoFundacao;
	private List<Youngling> membros = new ArrayList<Youngling>();
	
	public Cla (String nomeCla, Mestre mestre, int anoFundacao) {
		this.anoFundacao = anoFundacao;
		this.mestre = mestre;
		this.nomeCla = nomeCla;
	}

	public Mestre getMestre() {
		return mestre;
	}
	public void setMestre(Mestre mestre) {
		this.mestre = mestre;
	}

	public String getNomeCla() {
		return nomeCla;
	}

	public void setNomeCla(String nomeCla) {
		this.nomeCla = nomeCla;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public List<Youngling> getMembros() {
		return membros;
	}

	public void setMembros(List<Youngling> membros) {
		this.membros = membros;
	}
	
	
	
	
}
