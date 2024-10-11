package fr.univavignon.pokedex.api;

import org.mockito.Mockito;

public class PokemonMetadataProviderTest{

	public void testGetPokemonMetadata(int index) {
		IPokemonMetadataProviderTest test = Mockito.mock(IPokemonMetadataProviderTest.class)
		assert(index >= 0 && index <= 150);
	}

}
