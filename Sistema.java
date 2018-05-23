package br.usp.ime.labpoo;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
	private List<Planeta> _planetas = new ArrayList<Planeta>();
	private String nome;
	
	public Sistema(List<Planeta> _planetas, String nome) {
		super();
		this._planetas = _planetas;
		this.nome = nome;
	}
	
	public List<Planeta> get_planetas() {
		return _planetas;
	}
	public void set_planetas(List<Planeta> _planetas) {
		this._planetas = _planetas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
