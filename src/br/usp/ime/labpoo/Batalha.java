package br.usp.ime.labpoo;

import java.util.Random;

public class Batalha {
	private Ser[] combatentes = new Ser[2];
	
	private String acaoJedi[] = new String[5];
	private String acaoSith[] = new String[5];
	
	private int golpeJedi;
	private int golpeSith;
	
	private boolean jediEsquivando;
	private boolean sithEsquivando;

	public Batalha(Ser jedi, Ser sith) {
		Ser[] combs = new Ser[2];
		combs[0] = jedi;
		combs[1] = sith;
		jediEsquivando = false;
		sithEsquivando = false;
		
		this.combatentes = combs;
		
		for (int i=0; i<=4; i++) {
			if (i != 4) {
				acaoJedi[i] = jedi.getHabilidades()[i].getNome();
				acaoSith[i] = sith.getHabilidades()[i].getNome();
			}
			else {
				acaoJedi[4] = "esquiva";
				acaoSith[4] = "esquiva";
			}
		}
	}
	
	public void Momento(int golpeJedi, int golpeSith, int momento) {
		if (momento == 0) {
			if (golpeJedi == 4)
				jediEsquivando = true;
			else
				jediEsquivando = false;
			
			if (golpeSith == 4)
				sithEsquivando = true;
			else
				sithEsquivando = false;
		}
		
		if (momento == 1) {
			if (golpeJedi != 4) {
				if (combatentes[0].getHabilidades()[golpeJedi].getTipo() == Habilidade.tipodehabilidade.forca) {
					combatentes[1].setPontosDeVida(combatentes[1].getPontosDeVida()
							- combatentes[0].getHabilidades()[golpeJedi].getDano()
							- combatentes[0].getDominioDaForca());
				}
			}
				
			if (golpeSith != 4) {
				if (combatentes[1].getHabilidades()[golpeSith].getTipo() == Habilidade.tipodehabilidade.forca) {
					combatentes[0].setPontosDeVida(combatentes[0].getPontosDeVida()
							- combatentes[1].getHabilidades()[golpeSith].getDano()
							- combatentes[1].getDominioDaForca());
				}
			}
		}
		
		if (momento == 2) {
			if (golpeJedi != 4) {
				if (combatentes[0].getHabilidades()[golpeJedi].getTipo() == Habilidade.tipodehabilidade.sabre) {
					if (!sithEsquivando){
						combatentes[1].setPontosDeVida(combatentes[1].getPontosDeVida() 
								- combatentes[0].getHabilidades()[golpeJedi].getDano()
								-combatentes[0].getDominioDoSabre());
					}
				}
			}
				
			if (golpeSith != 4) {
				if (combatentes[1].getHabilidades()[golpeSith].getTipo() == Habilidade.tipodehabilidade.sabre) {
					if (!jediEsquivando) {
						combatentes[0].setPontosDeVida(combatentes[0].getPontosDeVida() -
								combatentes[1].getHabilidades()[golpeSith].getDano() -
								combatentes[1].getDominioDoSabre());
					}
				}
			}
		}
	}
	
	public boolean Rodada() {
		Random random = new Random();
		
		golpeJedi = random.nextInt(5);
		golpeSith = random.nextInt(5);
		
		for (int i = 0; i < 3; i++)
		{
			Momento(golpeJedi, golpeSith, i);
			if (combatentes[0].getPontosDeVida() <= 0 || combatentes[1].getPontosDeVida() <= 0)
				return true;
		}	
		return false;
	}

	public Ser[] getCombatentes() {
		return combatentes;
	}

	public void setCombatentes(Ser[] combatentes) {
		this.combatentes = combatentes;
	}

	public String[] getAcaoJedi() {
		return acaoJedi;
	}

	public void setAcaoJedi(String[] acaoJedi) {
		this.acaoJedi = acaoJedi;
	}

	public String[] getAcaoSith() {
		return acaoSith;
	}

	public void setAcaoSith(String[] acaoSith) {
		this.acaoSith = acaoSith;
	}

	public int getGolpeJedi() {
		return golpeJedi;
	}

	public void setGolpeJedi(int golpeJedi) {
		this.golpeJedi = golpeJedi;
	}

	public int getGolpeSith() {
		return golpeSith;
	}

	public void setGolpeSith(int golpeSith) {
		this.golpeSith = golpeSith;
	}

	public boolean isJediEsquivando() {
		return jediEsquivando;
	}

	public void setJediEsquivando(boolean jediEsquivando) {
		this.jediEsquivando = jediEsquivando;
	}

	public boolean isSithEsquivando() {
		return sithEsquivando;
	}

	public void setSithEsquivando(boolean sithEsquivando) {
		this.sithEsquivando = sithEsquivando;
	}
	
	
	
}
