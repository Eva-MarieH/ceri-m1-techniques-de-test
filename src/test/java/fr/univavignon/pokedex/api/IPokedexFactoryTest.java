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
		this.ipokedexfactory = Mockito.mock(IPokedexFactory.class);
		
		this.ipokemonmetadataprovider = Mockito.mock(IPokemonMetadataProvider.class);
		this.ipokemonfactory = Mockito.mock(IPokemonFactory.class);
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void testCreatePokedex() {
		IPokedex ipokedex = this.ipokedexfactory.createPokedex(ipokemonmetadataprovider, ipokemonfactory);
		
		Pokemon pokemon1 = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
		Pokemon pokemon2 = new Pokemon(1, "Pikachu", 126, 126, 90, 613, 64, 4000, 4, 56);
		
		if(pokemon1 != null && pokemon2 != null && ipokedex != null) {
			ipokedex.addPokemon(pokemon1);
			ipokedex.addPokemon(pokemon2);
		}
	}
}
