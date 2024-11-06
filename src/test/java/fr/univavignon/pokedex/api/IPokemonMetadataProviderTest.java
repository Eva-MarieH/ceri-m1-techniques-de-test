package fr.univavignon.pokedex.api;

import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonMetadataProviderTest {
	private IPokemonMetadataProvider ipokemonmetadataprovider;
	
	@Before
	public void initTestEnvironment() {
		this.ipokemonmetadataprovider = Mockito.mock(IPokemonMetadataProvider.class);
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	
	@Test
	public void testPokemonMetadataProvider() {
		Pokemon pokemon = new Pokemon(133, "Aquali", 186, 168, 90, 52, 56, 58, 40, 59);
		PokemonMetadata metadata = null;
		try {
			metadata = this.ipokemonmetadataprovider.getPokemonMetadata(133);
		} catch (PokedexException e) {
			e.printStackTrace();
		}
		
		if(metadata != null) {
			Mockito.when(metadata.getIndex()).thenReturn(1);
			Mockito.when(metadata.getName()).thenReturn("Salamèche");
			Mockito.when(metadata.getAttack()).thenReturn(0);
			Mockito.when(metadata.getDefense()).thenReturn(0);
			Mockito.when(metadata.getStamina()).thenReturn(0);
		}
	}
	
}
