package fr.univavignon.pokedex.api;

public class PokemonMetadataProviderTest implements IPokemonMetadataProviderTest {

	@Override
	public void testGetPokemonMetadata(int index) {
		assert(index >= 0 && index <= 150);
	}

}
