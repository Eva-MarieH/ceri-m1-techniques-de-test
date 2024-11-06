package fr.univavignon.pokedex.api;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonFactoryTest {
	private IPokemonFactory ipokemonfactory;
	
	@Before
	public void initTestEnvironment() {
		this.ipokemonfactory = Mockito.mock(IPokemonFactory.class);
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void testPokemonFactory() {
		Pokemon pokemon = this.ipokemonfactory.createPokemon(1, 3, 10, 20, 4);
		
		if(pokemon != null) {
			Mockito.when(pokemon.getIndex()).thenReturn(1);
			Mockito.when(pokemon.getCp()).thenReturn(3);
			Mockito.when(pokemon.getHp()).thenReturn(10);
			Mockito.when(pokemon.getDust()).thenReturn(20);
			Mockito.when(pokemon.getCandy()).thenReturn(4);
		}
	}
	
}