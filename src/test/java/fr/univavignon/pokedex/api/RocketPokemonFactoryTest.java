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
public void testUnmappedIndex() {
    Pokemon pokemon = factory.createPokemon(999, 100, 100, 1000, 10);
    assertNotNull(pokemon);
    assertEquals("Expected default pokemon name for unmapped index", "MISSINGNO", pokemon.getName());
}



@Test
public void testGeneratedStatsRange() {
    Pokemon pokemon = factory.createPokemon(1, 100, 100, 1000, 10);
    assertTrue("Attack stat should be non-negative", pokemon.getAttack() >= 0);
    assertTrue("Defense stat should be non-negative", pokemon.getDefense() >= 0);
    assertTrue("Stamina stat should be non-negative", pokemon.getStamina() >= 0);
    // Supposons que la valeur maximale attendue pour une stat soit 200
    assertTrue("Attack stat should not exceed max expected value", pokemon.getAttack() <= 200);
    assertTrue("Defense stat should not exceed max expected value", pokemon.getDefense() <= 200);
    assertTrue("Stamina stat should not exceed max expected value", pokemon.getStamina() <= 200);
}

    @Test
public void testExtremeValuedust() {
    int index = 1; 
    int CP = 600; 
    int hp = 100; 
    int dust = Integer.MAX_VALUE; 
    int candy = 10;
    Pokemon pokemon = factory.createPokemon(index,CP, hp, dust, candy);
    assertNotNull(pokemon);
    assertEquals("Bulbasaur", pokemon.getName());
    assertEquals(dust, pokemon.getDust());
    
}
@Test
public void testExtremeValueCP() {
    int index = 1; 
    int extremeCP = Integer.MAX_VALUE; 
    int hp = 100; 
    int dust = 5000; 
    int candy = 10;
    Pokemon pokemon = factory.createPokemon(index, extremeCP, hp, dust, candy);
    assertNotNull(pokemon);
    assertEquals("Bulbasaur", pokemon.getName());
    assertEquals(extremeCP, pokemon.getCp());
    
}

@Test
public void testExtremeValuehp() {
    int index = 1; 
    int CP = 600; 
    int hp = Integer.MAX_VALUE; 
    int dust = 5000; 
    int candy = 10;
    Pokemon pokemon = factory.createPokemon(index, CP, hp, dust, candy);
    assertNotNull(pokemon);
    assertEquals("Bulbasaur", pokemon.getName());
    assertEquals(hp, pokemon.getHp());
    
}
@Test
public void testExtremeValuecandy() {
    int index = 1; 
    int CP = 600; 
    int hp = 100; 
    int dust = 5000; 
    int candy = Integer.MAX_VALUE;
    Pokemon pokemon = factory.createPokemon(index,CP, hp, dust, candy);
    assertNotNull(pokemon);
    assertEquals("Bulbasaur", pokemon.getName());
    assertEquals(candy, pokemon.getCandy());
    
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
