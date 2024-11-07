package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonTrainerFactoryTest {
	private IPokemonTrainerFactory ipokemontrainerfactory;
	private IPokedexFactory ipokedexfactory;
	private IPokedex ipokedex;
	
	@Before
	public void initTestEnvironment() {
		this.ipokemontrainerfactory = mock(IPokemonTrainerFactory.class);
		this.ipokedexfactory = mock(IPokedexFactory.class);
		this.ipokedex = mock(IPokedex.class);
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void testCreateTrainer() {
		PokemonTrainer pokemonTrainer = new PokemonTrainer("Trainer1", Team.MYSTIC, ipokedex);
		
		assertEquals(pokemonTrainer.getName(),"Trainer1");
		assertEquals(pokemonTrainer.getTeam(),Team.MYSTIC);
		assertEquals(pokemonTrainer.getPokedex(),ipokedex);
		
		when(this.ipokemontrainerfactory.createTrainer("Trainer1", Team.MYSTIC, ipokedexfactory)).thenReturn(pokemonTrainer);
		
		
		
	}
	
}
