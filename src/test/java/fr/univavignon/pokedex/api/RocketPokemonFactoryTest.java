package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import fr.univavignon.pokedex.imp.RocketPokemonFactory;
public class RocketPokemonFactoryTest {

    private RocketPokemonFactory factory;

    @Before
    public void setUp() {
        factory = new RocketPokemonFactory();
    }
    @Test
    public void testCreatePokemonForUnmappedIndex() {
        int unmappedIndex = 2; // Cet indice n'est volontairement pas sur la map
        int cp = 0; 
        int hp = 0; 
        int dust = 0; 
        int candy = 0; 
        Pokemon pokemon = factory.createPokemon(unmappedIndex, cp, hp, dust, candy);
        assertNotNull(pokemon);
        assertEquals("MISSINGNO", pokemon.getName()); 
    }
    
    @Test
    public void testCreatePokemonValidIndex() {
        int index = 1; 
        int cp = 613; 
        int hp = 64; 
        int dust = 3000; 
        int candy = 3; 
        Pokemon pokemon = factory.createPokemon(index, cp, hp, dust, candy);
        assertNotNull(pokemon);
        assertEquals("Bulbasaur", pokemon.getName());
        assertTrue(pokemon.getAttack() >= 0);
        assertTrue(pokemon.getDefense() >= 0);
        assertTrue(pokemon.getStamina() >= 0);
    }

    @Test
    public void testCreatePokemonInvalidIndex() {
        int index = -1; 
        int cp = 0; 
        int hp = 0; 
        int dust = 0; 
        int candy = 0; 
        Pokemon pokemon = factory.createPokemon(index, cp, hp, dust, candy);
        assertNotNull(pokemon);
        assertEquals("Ash's Pikachu", pokemon.getName());
        assertEquals(1000, pokemon.getAttack());
        assertEquals(1000, pokemon.getDefense());
        assertEquals(1000, pokemon.getStamina());
        assertEquals(0, pokemon.getIv(), 0.001);
    }

    @Test
    public void testCreatePokemonMissingno() {
        int index = 0; 
        int cp = 10; 
        int hp = 10; 
        int dust = 200; 
        int candy = 1; 
        Pokemon pokemon = factory.createPokemon(index, cp, hp, dust, candy);
        assertNotNull(pokemon);
        assertEquals("MISSINGNO", pokemon.getName());
        assertTrue(pokemon.getIv() > 0);
    }
}
