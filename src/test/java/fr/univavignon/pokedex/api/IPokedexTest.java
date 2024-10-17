package fr.univavignon.pokedex.api;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class IPokedexTest {
	private IPokedex ipokedex;
	
	@Before
	public void initTestEnvironment() {
		this.ipokedex = Mockito.mock(IPokedex.class);
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void testSize() {
		int size = this.ipokedex.size();
		assert(size >= 0 && size <= 151);
	}
	
	@Test
	public void testAddPokemon() {
	}
	
	@Test
	public void testGetPokemon() {
	}
	
	@Test
	public void testGetPokemons() {
	}
}
