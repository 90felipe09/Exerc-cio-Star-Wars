package br.usp.ime.labpoo;
import java.util.Scanner;

public class Main {
	
	static Jedi jedi = new Jedi();
	static Sith sith = new Sith();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Batalha batalha = new Batalha(jedi, sith);
		
		while (!batalha.Rodada())
		{
			System.out.println(jedi.getNome() + " esta usando " + batalha.getAcaoJedi());
			System.out.println(sith.getApelido() + " esta usando " + batalha.getAcaoSith());
			System.out.println("Vida do Jedi: " + jedi.getPontosDeVida());
			System.out.println("Vida do Sith: " + sith.getPontosDeVida() + "\n\n");
			scan.hasNext();
		}
		if (jedi.getPontosDeVida() > 0) {
			if (sith.getPontosDeVida() <= 0)
				System.out.println(jedi.getNome() + " venceu! >.<");				
		}
		else if (sith.getPontosDeVida() > 0) {
			if (jedi.getPontosDeVida() <= 0)
				System.out.println(sith.getNome() + " venceu! >.<");
		}
		else
			System.out.println(jedi.getNome() + " e " + sith.getNome() + " morreram...");
		
		scan.close();
			
	}

}
