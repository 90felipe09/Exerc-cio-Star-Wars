package br.usp.ime.labpoo;

public class Academia {
	private String nomeAcademia;
	private Conselho conselhoAdm;
	private String classe; //jedi ou sith
	private Planeta localizacao; //planeta
	
	public Academia (String nomeAcademia, Conselho conselhoAdm, String classe, Planeta localizacao) {
		this.nomeAcademia = nomeAcademia;
		this.conselhoAdm = conselhoAdm;
		this.classe = classe;
		this.localizacao = localizacao;
	}

	public String getNomeAcademia() {
		return nomeAcademia;
	}

	public void setNomeAcademia(String nomeAcademia) {
		this.nomeAcademia = nomeAcademia;
	}

	public Conselho getConselhoAdm() {
		return conselhoAdm;
	}

	public void setConselhoAdm(Conselho conselhoAdm) {
		this.conselhoAdm = conselhoAdm;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public Planeta getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Planeta localizacao) {
		this.localizacao = localizacao;
	}

	//Gets and Setters

	
}
