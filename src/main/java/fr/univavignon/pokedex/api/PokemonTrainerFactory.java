package fr.univavignon.pokedex.api;

public class PokemonTrainerFactory implements IPokemonTrainerFactory {

	@Override
	public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
		IPokemonMetadataProvider metadataProvider = new PokemonMetadataProvider();
		IPokemonFactory pokemonFactory = new PokemonFactory();
		return new PokemonTrainer(name, team, pokedexFactory.createPokedex(metadataProvider, pokemonFactory));
	}

}