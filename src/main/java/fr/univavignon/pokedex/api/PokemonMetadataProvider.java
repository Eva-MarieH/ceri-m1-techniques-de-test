package fr.univavignon.pokedex.api;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {
	
	@Override
	public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
		return new PokemonMetadata(index,"Aquali", 186, 168, 90);
	}

}
