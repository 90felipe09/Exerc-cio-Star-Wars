
public class Cla {
	private String nomeCla;
	private Mestre mestre;
	private int anoFundacao;
	
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
	
	
}
