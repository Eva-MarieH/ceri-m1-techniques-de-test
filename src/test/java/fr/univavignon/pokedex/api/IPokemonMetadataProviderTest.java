package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
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
		PokemonMetadata metadata = new PokemonMetadata(133, "Aquali", 186, 168, 90);
		try {
			when(this.ipokemonmetadataprovider.getPokemonMetadata(133)).thenReturn(metadata);
		} catch (PokedexException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		assertEquals(metadata.getIndex(),133);
		assertEquals(metadata.getName(),"Aquali");
		assertEquals(metadata.getAttack(),186);
		assertEquals(metadata.getDefense(),168);
		assertEquals(metadata.getStamina(),90);
	}
	
}
