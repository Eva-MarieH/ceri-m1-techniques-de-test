package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonMetadataProviderTest {
	private PokemonMetadataProvider pokemonmetadataprovider;
	
	@Before
	public void initTestEnvironment() {
		this.pokemonmetadataprovider = new PokemonMetadataProvider();
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	
	@Test
	public void testPokemonMetadataProvider() {
		Pokemon pokemon = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4, 100);
		PokemonMetadata metadata = new PokemonMetadata(133, "Aquali", 186, 168, 260);
		try {
			PokemonMetadata metadataCreated = this.pokemonmetadataprovider.getPokemonMetadata(133);
			
			assertEquals(metadataCreated.getIndex(),metadata.getIndex());
			assertEquals(metadataCreated.getName(),metadata.getName());
			assertEquals(metadataCreated.getAttack(),metadata.getAttack());
			assertEquals(metadataCreated.getDefense(),metadata.getDefense());
			assertEquals(metadataCreated.getStamina(),metadata.getStamina());
			
		} catch (PokedexException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		assertEquals(metadata.getIndex(),133);
		assertEquals(metadata.getName(),"Aquali");
		assertEquals(metadata.getAttack(),186);
		assertEquals(metadata.getDefense(),168);
		assertEquals(metadata.getStamina(),260);
	}
	
}
