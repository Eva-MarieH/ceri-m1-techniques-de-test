package fr.univavignon.pokedex.api;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PokemonComparatorsTest {
	private PokemonComparators pokemoncomparators;
	
	@Before
	public void initTestEnvironment() {
		this.pokemoncomparators = Mockito.mock(PokemonComparators.class);
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void pokemonComparatorsTest() {
		Pokemon pokemon1 = new Pokemon(144, "Pikachu", 145, 58, 60, 123, 80, 4000, 9, 58.5);
		Pokemon pokemon2 = new Pokemon(88, "Carapuce", 200, 200, 80, 74, 60, 1500, 1, 40);
		
		if(pokemon1 != null && pokemon2 != null) {
			Mockito.when(this.pokemoncomparators.compare(pokemon1, pokemon2)).thenReturn(0);
		}
	}
}
