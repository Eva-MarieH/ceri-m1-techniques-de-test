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
		
	}
	
}
