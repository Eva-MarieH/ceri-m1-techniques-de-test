package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class IPokedexTest {
	private Pokedex pokedex;
	
	@Before
	public void initTestEnvironment() {
		this.pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());
	}
	
	@After
	public void destroyTestEnvironment() {
		
	}
	
	@Test
	public void testSize() {
		int size = this.pokedex.size();
		assert(size >= 0 && size <= 151);
	}
	
	@Test
	public void testPokedex() {
		Pokemon pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
		
		this.pokedex.addPokemon(pokemon);
		try {
			if(pokemon != null) {
				assertEquals(this.pokedex.getPokemonMetadata(0).getIndex(),pokemon.getIndex());
				assertEquals(this.pokedex.getPokemonMetadata(0).getName(),pokemon.getName());
				assertEquals(this.pokedex.getPokemonMetadata(0).getAttack(),pokemon.getAttack());
				assertEquals(this.pokedex.getPokemonMetadata(0).getDefense(),pokemon.getDefense());
				assertEquals(this.pokedex.getPokemonMetadata(0).getStamina(),pokemon.getStamina());
				
				assertEquals(this.pokedex.getPokemon(0),pokemon);
				assertEquals(this.pokedex.getPokemons().get(0),pokemon);
				assertEquals(this.pokedex.getPokemons().size(),1);
				
				Pokemon pokemonCreated = this.pokedex.createPokemon(pokemon.getIndex(), pokemon.getCp(), pokemon.getHp(), pokemon.getDust(), pokemon.getCandy());
				
				assertEquals(pokemonCreated.getIndex(),pokemon.getIndex());
				assertEquals(pokemonCreated.getName(),pokemon.getName());
				assertEquals(pokemonCreated.getAttack(),pokemon.getAttack());
				assertEquals(pokemonCreated.getDefense(),pokemon.getDefense());
				assertEquals(pokemonCreated.getStamina(),pokemon.getStamina());
				assertEquals(pokemonCreated.getCp(),pokemon.getCp());
				assertEquals(pokemonCreated.getHp(),pokemon.getHp());
				assertEquals(pokemonCreated.getDust(),pokemon.getDust());
				assertEquals(pokemonCreated.getCandy(),pokemon.getCandy());
			}
		} catch (PokedexException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		try {
			if(pokemon != null) {
				assertNull(this.pokedex.getPokemonMetadata(-1));				
			}
		} catch (PokedexException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		try {
			if(pokemon != null) {
				assertNull(this.pokedex.getPokemon(-1));				
			}
		} catch (PokedexException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
	}
	
}
