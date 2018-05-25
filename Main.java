package br.usp.ime.labpoo;

public class Main {
	
	static Jedi jedi = new Jedi();
	static Sith sith = new Sith();
	
	public static void main(String[] args) 
	{
		Batalha batalha = new Batalha(jedi, sith);
	}

}
