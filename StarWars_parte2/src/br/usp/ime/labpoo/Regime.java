package br.usp.ime.labpoo;

import java.util.List;
import java.util.ArrayList;

public class Regime {
	private String _nome;
	private Ser chefeDeEstado;
	private List<Planeta> planetasControlados = new ArrayList<Planeta>();
	private Planeta capital;
	
	public String get_nome() {
		return _nome;
	}
	public void set_nome(String _nome) {
		this._nome = _nome;
	}
	public Ser getChefeDeEstado() {
		return chefeDeEstado;
	}
	public void setChefeDeEstado(Ser chefeDeEstado) {
		this.chefeDeEstado = chefeDeEstado;
	}
	public List<Planeta> getPlanetasControlados() {
		return planetasControlados;
	}
	public void setPlanetasControlados(List<Planeta> planetasControlados) {
		this.planetasControlados = planetasControlados;
	}
	public Planeta getCapital() {
		return capital;
	}
	public void setCapital(Planeta capital) {
		this.capital = capital;
	}
	
	
	
}
