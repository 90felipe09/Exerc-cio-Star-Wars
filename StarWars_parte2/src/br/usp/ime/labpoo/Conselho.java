package br.usp.ime.labpoo;

import java.util.List;
import java.util.ArrayList;

public class Conselho {
	private String _nome;
	private List<Ser> _membros = new ArrayList<Ser>();
	private Academia academia;
	private String ordem;
	
	public Conselho(String _nome, List<Ser> _membros, Academia academia, String ordem) {
		this._nome = _nome;
		this._membros = _membros;
		this.academia = academia;
		this.ordem = ordem;
	}
	
	public String get_nome() {
		return _nome;
	}
	public void set_nome(String _nome) {
		this._nome = _nome;
	}
	public List<Ser> get_membros() {
		return _membros;
	}
	public void set_membros(List<Ser> _membros) {
		this._membros = _membros;
	}
	public Academia getAcademia() {
		return academia;
	}
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	
	
}
