package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonFactoryTest {
	private PokemonFactory pokemonfactory;
	
	@Before
	public void initTestEnvironment() {
		this.pokemonfactory = new PokemonFactory();
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void testPokemonFactory() {
		Pokemon pokemon = new Pokemon(133, "Aquali", 186, 168, 90, 2729, 202, 5000, 4, 100);
		
		Pokemon pokemonCreated = this.pokemonfactory.createPokemon(133, 2729, 202, 5000, 4);
		
		assertEquals(pokemon.getIndex(),133);
		assertEquals(pokemon.getCp(),2729);
		assertEquals(pokemon.getHp(),202);
		assertEquals(pokemon.getDust(),5000);;
		assertEquals(pokemon.getCandy(),4);
		assertEquals(pokemon.getIv(),100,0);
		
		assertEquals(pokemonCreated.getIndex(),pokemon.getIndex());
		assertEquals(pokemonCreated.getCp(), pokemon.getCp());
		assertEquals(pokemonCreated.getHp(), pokemon.getHp());
		assertEquals(pokemonCreated.getDust(), pokemon.getDust());
		assertEquals(pokemonCreated.getCandy(), pokemon.getCandy());
		
		assertNull(this.pokemonfactory.createPokemon(-1, 0, 0, 0, 0));
	}
	
}