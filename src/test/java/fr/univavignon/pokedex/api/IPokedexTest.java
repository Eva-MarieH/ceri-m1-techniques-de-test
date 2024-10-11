package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.Test;

public interface IPokedexTest {
	
	@Test
	public abstract void testSize();
	
	@Test
	public abstract void testAddPokemon();
	
	@Test
	public abstract void testGetPokemon();
	
	@Test
	public abstract void testGetPokemons();
}
