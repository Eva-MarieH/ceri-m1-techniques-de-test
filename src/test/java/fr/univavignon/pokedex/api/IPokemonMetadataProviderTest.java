package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.Test;

public class IPokemonMetadataProviderTest {

	@Test
	public void testGetPokemonMetadata(int index) {
		assert(index >= 0 && index <= 150);
	}
	
}
