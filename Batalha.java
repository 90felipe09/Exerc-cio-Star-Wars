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
				acaoJedi[i] = jedi.habilidades[i].nome;
				acaoSith[i] = sith.habilidades[i].nome;
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
				if (combatentes[0].habilidades[golpeJedi].tipo == Habilidades.tipodehabilidade.força) {
					combatentes[1].pontosDeVida -= combatentes[0].habilidades[golpeJedi].dano;
				}
			}
				
			if (golpeSith != 4) {
				if (combatentes[1].habilidades[golpeSith].tipo == Habilidades.tipodehabilidade.força) {
					combatentes[0].pontosDeVida -= combatentes[1].habilidades[golpeSith].dano;
				}
			}
		}
		
		if (momento == 2) {
			if (golpeJedi != 4) {
				if (combatentes[0].habilidades[golpeJedi].tipo == Habilidades.tipodehabilidade.sabre) {
					if (!sithEsquivando){
						combatentes[1].pontosDeVida -= combatentes[0].habilidades[golpeJedi].dano;
					}
				}
			}
				
			if (golpeSith != 4) {
				if (combatentes[1].habilidades[golpeSith].tipo == Habilidades.tipodehabilidade.sabre) {
					if (!jediEsquivando) {
						combatentes[0].pontosDeVida -= combatentes[1].habilidades[golpeSith].dano;
					}
				}
			}
		}
	}
	
	public boolean Rodada() {
		Random random = new Random();
		
		golpeJedi = random.nextInt(4);
		golpeSith = random.nextInt(4);
		
		for (int i = 0; i < 3; i++)
		{
			momento(golpeJedi, golpeSith, i);
			if (combatentes[0].pontosDeVida <= 0 || combatentes[1].pontosDeVida <= 0)
				return true;
		}	
		return false;
	}
	
	
}
