package br.usp.ime.labpoo;

public class Planeta {
	private String _nome;
	private Sistema _sistema;
	private String _cor;
	private int _di�metro;
	private Regime _regime;
	private String _cidadeCapital;
	
	public Planeta(String _nome, Sistema _sistema, String _cor, int _di�metro, Regime _regime, String _cidadeCapital) {
		super();
		this._nome = _nome;
		this._sistema = _sistema;
		this._cor = _cor;
		this._di�metro = _di�metro;
		this._regime = _regime;
		this._cidadeCapital = _cidadeCapital;
	}
	public String get_nome() {
		return _nome;
	}
	public void set_nome(String _nome) {
		this._nome = _nome;
	}
	public Sistema get_sistema() {
		return _sistema;
	}
	public void set_sistema(Sistema _sistema) {
		this._sistema = _sistema;
	}
	public String get_cor() {
		return _cor;
	}
	public void set_cor(String _cor) {
		this._cor = _cor;
	}
	public int get_di�metro() {
		return _di�metro;
	}
	public void set_di�metro(int _di�metro) {
		this._di�metro = _di�metro;
	}
	public Regime get_regime() {
		return _regime;
	}
	public void set_regime(Regime _regime) {
		this._regime = _regime;
	}
	public String get_cidadeCapital() {
		return _cidadeCapital;
	}
	public void set_cidadeCapital(String _cidadeCapital) {
		this._cidadeCapital = _cidadeCapital;
	}
	

	
	
}
