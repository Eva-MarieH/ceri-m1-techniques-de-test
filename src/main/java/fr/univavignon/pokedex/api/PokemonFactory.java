package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory {
	
	@Override
	public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
		PokemonMetadataProvider metadataProvider = new PokemonMetadataProvider();
		try {
			PokemonMetadata metadata = metadataProvider.getPokemonMetadata(index);
			return new Pokemon(index, metadata.getName(), metadata.getAttack(), metadata.getDefense(), metadata.getStamina(), cp, hp, dust, candy, 100);
		} catch (PokedexException e) {
			e.printStackTrace();
		}
		return null;
	}

}
