package fr.univavignon.pokedex.api;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokedexFactoryTest {
	private IPokedexFactory ipokedexfactory;
	
	private IPokemonMetadataProvider ipokemonmetadataprovider;
	private IPokemonFactory ipokemonfactory;
	
	@Before
	public void initTestEnvironment() {
		this.ipokedexfactory = new PokedexFactory();
		
		this.ipokemonmetadataprovider = new PokemonMetadataProvider();
		this.ipokemonfactory = new PokemonFactory();
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void testCreatePokedex() {
		Pokedex pokedex = (Pokedex) this.ipokedexfactory.createPokedex(ipokemonmetadataprovider, ipokemonfactory);
		
		Pokemon pokemon1 = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
		Pokemon pokemon2 = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4, 100);
		
		if(pokemon1 != null && pokemon2 != null && pokedex != null) {
			pokedex.addPokemon(pokemon1);
			pokedex.addPokemon(pokemon2);
		}
	}
}
