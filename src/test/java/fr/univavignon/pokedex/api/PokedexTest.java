package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Comparator;
import java.util.List;

public class PokedexTest {

    private Pokedex pokedex;
    private Pokemon pikachu;
    private Pokemon bulbasaur;

    @Before
    public void setUp() {
        pokedex = new Pokedex();
        pikachu = new Pokemon(25, "Pikachu", 55, 40, 90, 35, 60, 3000, 50, 0.8);
        bulbasaur = new Pokemon(1, "Bulbizarre", 49, 49, 45, 318, 45, 2000, 10, 0.6);
        pokedex.addPokemon(pikachu);
        pokedex.addPokemon(bulbasaur);
    }
    @Test(expected = PokedexException.class)
    public void testGetPokemonInvalidIdNegative() throws PokedexException {
        pokedex.getPokemon(-1);
    }
    
    @Test(expected = PokedexException.class)
    public void testGetPokemonInvalidIdGreaterThanSize() throws PokedexException {
        pokedex.getPokemon(pokedex.size());
    }
    
    @Test(expected = PokedexException.class)
    public void testGetPokemonMetadataInvalidIndexNegative() throws PokedexException {
        pokedex.getPokemonMetadata(-1);
    }
    
    @Test(expected = PokedexException.class)
    public void testGetPokemonMetadataInvalidIndexGreaterThanLimit() throws PokedexException {
        pokedex.getPokemonMetadata(151);
    }
    @Test
    public void testSize() {
        assertEquals(2, pokedex.size());
    }

    @Test
    public void testAddPokemon() {
        int index = pokedex.addPokemon(new Pokemon(4, "Salamèche", 52, 43, 39, 309, 39, 2000, 10, 0.7));
        assertEquals(2, index);
        assertEquals(3, pokedex.size());
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        assertEquals(pikachu, pokedex.getPokemon(0));
        assertEquals(bulbasaur, pokedex.getPokemon(1));
    }

    @Test(expected = PokedexException.class)
    public void testGetPokemonInvalidId() throws PokedexException {
        pokedex.getPokemon(999);
    }

    @Test
    public void testGetPokemons() {
        List<Pokemon> allPokemons = pokedex.getPokemons();
        assertNotNull(allPokemons);
        assertFalse(allPokemons.isEmpty());
        assertEquals(2, allPokemons.size());
    }

    @Test
    public void testGetPokemonsWithOrder() {
        List<Pokemon> sortedPokemons = pokedex.getPokemons(Comparator.comparing(Pokemon::getIndex));
        assertNotNull(sortedPokemons);
        assertFalse(sortedPokemons.isEmpty());
        assertEquals("Bulbizarre", sortedPokemons.get(0).getName());
        assertEquals("Pikachu", sortedPokemons.get(1).getName());
    }

    @Test
    public void testCreatePokemon() {
        Pokemon charmander = pokedex.createPokemon(4, 309, 39, 2000, 10);
        assertNotNull(charmander);
        assertEquals("Pikachu", charmander.getName());
    }

    @Test
    public void testGetPokemonMetadataValid() throws PokedexException {
        PokemonMetadata metadata = pokedex.getPokemonMetadata(0);
        assertNotNull(metadata);
        assertEquals("Pikachu", metadata.getName());
    }

    @Test(expected = PokedexException.class)
    public void testGetPokemonMetadataInvalid() throws PokedexException {
        pokedex.getPokemonMetadata(151);
    }
}
