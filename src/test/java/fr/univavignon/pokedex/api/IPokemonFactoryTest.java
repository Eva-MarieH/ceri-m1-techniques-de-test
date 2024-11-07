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
		Pokemon pokemon = new Pokemon(133, "Aquali", 186, 168, 90, 52, 56, 58, 40, 59);
		
		when(this.ipokemonfactory.createPokemon(133, 52, 56, 58, 40)).thenReturn(pokemon);
		
		assertEquals(pokemon.getIndex(),133);
		assertEquals(pokemon.getCp(),52);
		assertEquals(pokemon.getHp(),56);
		assertEquals(pokemon.getDust(),58);
		assertEquals(pokemon.getCandy(),40);
		
	}
	
}