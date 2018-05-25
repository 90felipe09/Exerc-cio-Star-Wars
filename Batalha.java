package br.usp.ime.labpoo;

public class Batalha {
	private Ser[] combatentes = new Ser[2];

	public Batalha(Ser jedi, Ser sith) {
		super();
		Ser[] combs = new Ser[2];
		combs[0] = jedi;
		combs[1] = sith;
		this.combatentes = combs;
	}
	
	
	
	
}
