package fr.univavignon.pokedex.api;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonTrainerFactoryTest {
	private IPokemonTrainerFactory ipokemontrainerfactory;
	
	private IPokedexFactory ipokedexfactory;
	
	@Before
	public void initTestEnvironment() {
		this.ipokemontrainerfactory = Mockito.mock(IPokemonTrainerFactory.class);
		
		this.ipokedexfactory = Mockito.mock(IPokedexFactory.class);
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void testCreateTrainer() {
		PokemonTrainer pokemonTrainer = this.ipokemontrainerfactory.createTrainer("Trainer1", Team.MYSTIC, this.ipokedexfactory);
		
		if(pokemonTrainer!=null) {
			Mockito.when(pokemonTrainer.getName()).thenReturn("Trainer1");
			Mockito.when(pokemonTrainer.getTeam()).thenReturn(Team.MYSTIC);
		}
	}
	
}
