package br.usp.ime.labpoo;

public class Main {
	
	static Jedi jedi = new Jedi();
	static Sith sith = new Sith();
	static Scanner scan = new Scanner();
	
	public static void main(String[] args) 
	{
		Batalha batalha = new Batalha(jedi, sith);
		
		while (!batalha.Rodada())
		{
			System.out.println("Jedi esta usando " + batalha.acaoJedi)
			System.out.println("Vida do Jedi: " + jedi.pontosDeVida);
			System.out.println("Vida do Sith: " + sith.pontosDeVida + "\n\n");
			System.in.read();
			
		}
	}

}
