package fr.univavignon.pokedex.api;

import static org.mockito.Mockito.mockitoSession;

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
		Pokemon pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
		
		this.ipokedex.addPokemon(pokemon);
		try {
			Mockito.when(this.ipokedex.getPokemonMetadata(0)).thenReturn(pokemon);
		} catch (PokedexException e) {
			e.printStackTrace();
		}
		
	}
	
}
