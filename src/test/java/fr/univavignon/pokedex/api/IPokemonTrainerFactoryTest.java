package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonTrainerFactoryTest {
	private PokemonTrainerFactory pokemontrainerfactory;
	private PokedexFactory pokedexfactory;
	private Pokedex pokedex;
	
	@Before
	public void initTestEnvironment() {
		this.pokemontrainerfactory = new PokemonTrainerFactory();
		this.pokedexfactory = new PokedexFactory();
		this.pokedex = (Pokedex) this.pokedexfactory.createPokedex(new PokemonMetadataProvider(), new PokemonFactory());
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void testCreateTrainer() {
		PokemonTrainer pokemonTrainer = new PokemonTrainer("Trainer1", Team.MYSTIC, pokedex);
		
		assertNotNull(pokemonTrainer);
		assertEquals(pokemonTrainer.getName(),"Trainer1");
		assertEquals(pokemonTrainer.getTeam(),Team.MYSTIC);
		assertEquals(pokemonTrainer.getPokedex(),pokedex);
		
		PokemonTrainer trainerCreated = this.pokemontrainerfactory.createTrainer("Trainer1", Team.MYSTIC, pokedexfactory);
		
		assertEquals(trainerCreated.getName(),pokemonTrainer.getName());
		assertEquals(trainerCreated.getTeam(),pokemonTrainer.getTeam());
		//assertEquals(trainerCreated.getPokedex(),pokemonTrainer.getPokedex());
		
	}
	
}
