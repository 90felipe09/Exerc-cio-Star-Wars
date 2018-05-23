
public class Aprendiz extends Sith {
	private double conhecSabre; //porcentagem de conhecimento para construir o sabre
	private Lorde treinador;
	
	public Aprendiz (String nome, String genero, String especie, int ano, String planeta, double conc, 
			double paz,	double raiva, String apelido, boolean telepatia, boolean telecinese, 
			boolean persuasao, Academia academia, double conhecSabre, Lorde treinador) {
		super(nome, genero, especie, ano, planeta, conc, paz, raiva, apelido, telepatia, telecinese, persuasao, academia);
		this.conhecSabre = conhecSabre;
		this.treinador = treinador;
	}

	public double getConhecSabre() {
		return conhecSabre;
	}
	public void setConhecSabre(double conhecSabre) {
		this.conhecSabre = conhecSabre;
	}
	
}
