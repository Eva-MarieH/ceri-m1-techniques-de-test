package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

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
		Pokemon pokemon = new Pokemon(133, "Aquali", 186, 168, 90, 2729, 202, 5000, 4, 100);
		
		when(this.ipokemonfactory.createPokemon(133, 2729, 202, 5000, 4)).thenReturn(pokemon);
		
		assertEquals(pokemon.getIndex(),133);
		assertEquals(pokemon.getCp(),2729);
		assertEquals(pokemon.getHp(),202);
		assertEquals(pokemon.getDust(),5000);;
		assertEquals(pokemon.getCandy(),4);
		
		
	}
	
}