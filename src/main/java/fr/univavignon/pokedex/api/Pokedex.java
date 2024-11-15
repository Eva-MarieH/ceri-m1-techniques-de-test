package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex {
	private List<Pokemon> pokedex = new ArrayList<Pokemon>();
	private PokemonMetadataProvider metadataProvider;
	private PokemonFactory pokemonFactory;
	
	public Pokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
		this.metadataProvider = (PokemonMetadataProvider) metadataProvider;
		this.pokemonFactory = (PokemonFactory) pokemonFactory;
	}
	
	@Override
	public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
		return this.metadataProvider.getPokemonMetadata(index);
	}

	@Override
	public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
		return this.pokemonFactory.createPokemon(index, cp, hp, dust, candy);
	}

	@Override
	public int size() {
		return pokedex.size();
	}

	@Override
	public int addPokemon(Pokemon pokemon) {
		pokedex.add(pokemon);
		return 0;
	}

	@Override
	public Pokemon getPokemon(int id) throws PokedexException {
		for(Pokemon p: pokedex) {
			if(p.getIndex()==id) {
				return p;
			}
		}
		throw new PokedexException("L'index donné n'est pas valide ou ne correspond à aucun pokemon dans le pokedex");
	}

	@Override
	public List<Pokemon> getPokemons() {
		return pokedex;
	}

	@Override
	public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
		List<Pokemon> pokedex_bis = pokedex;
		List<Pokemon> pokedex_ordered = new ArrayList<Pokemon>();
		for(int i=0; i<pokedex_bis.size(); i++) {
			Pokemon gagnant = pokedex_bis.get(0);
			for(Pokemon p2: pokedex_bis) {
				if(gagnant!=p2 && order.compare(gagnant, p2)==2) {
					gagnant = p2;
				}
			}	
			pokedex_ordered.add(gagnant);
			pokedex_bis.remove(gagnant);
		}
		return pokedex_ordered;
	}

}
