package br.usp.ime.labpoo;
import java.util.Scanner;

public class Main {
	
	static Jedi jedi = new Jedi();
	static Sith sith = new Sith();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Batalha batalha = new Batalha(jedi, sith);
		
		System.out.println("A BATALHA ENTRE "+jedi.getNome()+" E "+sith.getApelido()+" COMECOU");
		System.out.println("Vida do Jedi: " + jedi.getPontosDeVida());
		System.out.println("Vida do Sith: " + sith.getPontosDeVida() + "\n\n");
		
		while (!batalha.Rodada()) {
			System.out.println(jedi.getNome() + " esta usando "
					+ batalha.getAcaoJedi()[batalha.getGolpeJedi()]);
			System.out.println(sith.getApelido() + " esta usando "
					+ batalha.getAcaoSith()[batalha.getGolpeSith()]);
			System.out.println("Vida do Jedi: " + jedi.getPontosDeVida());
			System.out.println("Vida do Sith: " + sith.getPontosDeVida() + "\n\n");
			//scan.nextLine();
		}
		System.out.println(jedi.getNome() + " esta usando "
				+ batalha.getAcaoJedi()[batalha.getGolpeJedi()]);
		System.out.println(sith.getApelido() + " esta usando "
				+ batalha.getAcaoSith()[batalha.getGolpeSith()]);
		System.out.println("Vida do Jedi: " + jedi.getPontosDeVida());
		System.out.println("Vida do Sith: " + sith.getPontosDeVida() + "\n\n");
		
		if (jedi.getPontosDeVida() > 0) {
			if (sith.getPontosDeVida() <= 0)
				System.out.println(jedi.getNome() + " venceu! >.<");				
		}
		else if (sith.getPontosDeVida() > 0) {
			if (jedi.getPontosDeVida() <= 0)
				System.out.println(sith.getApelido() + " venceu! >.<");
		}
		else
			System.out.println(jedi.getNome() + " e " + sith.getApelido() + " morreram...");
		
		scan.close();
			
	}

}
