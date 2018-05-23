
public class Jedi extends Ser{
	private boolean telepatia;
	private boolean telecinese;  //0, se nao tiver tal poder; 1, se tiver
	private boolean persuasao;
	
	//eh necessario um metodo para aumentar o percentual de paz interna
	
	private Academia academia;
	//academia
	
	public Jedi(String nome, String genero, String especie, int ano, String planeta, double conc, 
			double paz, double raiva, boolean telepatia, boolean telecinese, boolean persuasao, Academia academia) {
		super(nome, genero, especie, ano, planeta, conc, paz, raiva);
		this.academia = academia;
		this.persuasao = persuasao;
		this.telecinese = telecinese;
		this.telepatia = telepatia;
	}

	public boolean isTelepatia() {
		return telepatia;
	}
	public void setTelepatia(boolean telepatia) {
		this.telepatia = telepatia;
	}

	public boolean isTelecinese() {
		return telecinese;
	}
	public void setTelecinese(boolean telecinese) {
		this.telecinese = telecinese;
	}

	public boolean isPersuasao() {
		return persuasao;
	}
	public void setPersuasao(boolean persuasao) {
		this.persuasao = persuasao;
	}
	
	
}
