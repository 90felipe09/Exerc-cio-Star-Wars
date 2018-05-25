package br.usp.ime.labpoo;

import java.util.Random;

public class NomesAleatorios {
	// 10 Nomes Jedis
	private static String[] jedis = {
			"Jebediah Mnaa", 
			"Vanel Xemo", 
			"Anacus Thraria", 
			"Arbot", 
			"Rulowan Torag", 
			"Chioorni", 
			"Fias Koradou", 
			"Drox Ziracch", 
			"Eezek Otlre", 
			"Grepazs Kar'vel"};
	
	// 10 Nomes Siths
	private static String[] siths = {
			"Graarrn Limruo",
			"Francis Starfire",
			"Snivo",
			"Tokmal",
			"Ballagor",
			"Asnek Ask'sro",
			"Tresaiser",
			"Torbe'una",
			"Tonal'ugi",
			"Lengent Drykin",
	};
	
	// 2 G�neros
	private static String[] generos = {
			"Masculino",
			"Feminino"
	};
	
	// 6 Esp�cies
	private static String[] especies = {
			"Humano",
			"Togruta",
			"Koorivar",
			"Aqualish Ualaq",
			"Muun",
			"Quarren"
	};
	// 8 habilidades
	private static String[] habilidadesSithSabre = {
			"Mou Kei",
			"Praetoria Ishu",
			"Praetoria Vinil",
			"Shiak",
			"Shun",
			"Cho Mok",
			"Jung",
			"Jung Ma",
	};
	// 8 habilidades
	private static String[] habilidadesJediSabre = {
			"Kai Kan",
			"Jung Ma",
			"Sai Sho",
			"Shiim",
			"Sun Djem",
			"Twin Suns",
			"Cho Mai",
			"Dulon",
	};
	// 8 habilidades
	private static String[] habilidadesSithForca = {
			"Deadly Sight",
			"Drain Knowledge",
			"Force Destruction",
			"Force Drain",
			"Force Fear",
			"Force Horror",
			"Force Insanity",
			"Force Lightning",
	};
	// 8 habilidades
	private static String[] habilidadesJediForca = {
			"Droid Disable",
			"Force Enlightenment",
			"Force Healing",
			"Force Ghost",
			"Force Light",
			"Force Orb",
			"Force Projection",
			"Force Stun",
	};
	// 8 planetas
	private static String[] planetas = {
			"Coruscant",
			"Geonosis",
			"Serenno",
			"Tatooine",
			"Korriban",
			"Naboo",
			"Stewjon",
	};
	
	public static String getNomeJedi() 
	{
		Random random = new Random();
		return jedis[random.nextInt(10)];
	}
	
	public static String getNomeSith() 
	{
		Random random = new Random();
		return siths[random.nextInt(10)];
	}
	
	public static String getGenero() 
	{
		Random random = new Random();
		return generos[random.nextInt(2)];
	}
	
	public static String getEspecies() 
	{
		Random random = new Random();
		return especies[random.nextInt(6)];
	}
	
	public static String getHabilidadesSithSabre() 
	{
		Random random = new Random();
		return habilidadesSithSabre[random.nextInt(8)];
	}
	
	public static String getHabilidadesJediForca() 
	{
		Random random = new Random();
		return habilidadesJediForca[random.nextInt(8)];
	}
	
	public static String getHabilidadesSithForca() 
	{
		Random random = new Random();
		return habilidadesSithForca[random.nextInt(8)];
	}
	
	public static String getHabilidadesJediSabre() 
	{
		Random random = new Random();
		return habilidadesJediSabre[random.nextInt(8)];
	}
	
	public static String getPlanetas() 
	{
		Random random = new Random();
		return planetas[random.nextInt(8)];
	}
	
	public static Habilidade[] getListaHabilidadesJedi() 
	{
		Random random = new Random();
		Habilidade[] habilidades = new Habilidade[4];
		for (int i = 0 ; i < 4; i++)
		{
			// Habilidade de Sabre
			if (random.nextBoolean())
			{
				habilidades[i] = new Habilidade(
						getHabilidadesJediSabre(),
						Habilidade.tipodehabilidade.sabre,
						random.nextInt(30) + 50
						);
			}
			// Habilidade de Forca
			else 
			{
				habilidades[i] = new Habilidade(
						getHabilidadesJediForca(),
						Habilidade.tipodehabilidade.forca,
						random.nextInt(30) + 20
						);
			}
		}
		return habilidades;
	}
	
	public static Habilidade[] getListaHabilidadesSith() 
	{
		Random random = new Random();
		Habilidade[] habilidades = new Habilidade[4];
		for (int i = 0 ; i < 4; i++)
		{
			// Habilidade de Sabre
			if (random.nextBoolean())
			{
				habilidades[i] = new Habilidade(
						getHabilidadesSithSabre(),
						Habilidade.tipodehabilidade.sabre,
						random.nextInt(31) + 50
						);
			}
			// Habilidade de Forca
			else 
			{
				habilidades[i] = new Habilidade(
						getHabilidadesSithForca(),
						Habilidade.tipodehabilidade.forca,
						random.nextInt(31) + 20
						);
			}
		}
		return habilidades;
	}
	
}
