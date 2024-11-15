package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.List;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {
	List<PokemonMetadata> bdd;
	
	public PokemonMetadataProvider() {
		bdd = new ArrayList<PokemonMetadata>();
		bdd.add(new PokemonMetadata(133, "Aquali", 186, 168, 90));
		bdd.add(new PokemonMetadata(0, "Bulbizarre", 126, 126, 260));
	}
	
	@Override
	public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
		PokemonMetadata metadata = null;
		for(PokemonMetadata m : bdd) {
			if(m.getIndex()==index) {
				metadata = m;
			}
		}
		if(metadata==null) {
			throw new PokedexException("L'index n'est pas valide");
		}
		return metadata;
	}

}
