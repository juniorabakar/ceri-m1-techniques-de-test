package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PokemonTest {

    private Pokemon pokemon;

    @Before
    public void setUp() {
      
        pokemon = new Pokemon(0, "Bulbizarre", 118, 111, 128, 613, 64, 4000, 4, 0.56);
    }

    @Test
    public void testGetCp() {
        assertEquals("Le CP devrait être 613", 613, pokemon.getCp());
    }

    @Test
    public void testGetHp() {
        assertEquals("Le HP devrait être 64", 64, pokemon.getHp());
    }

    @Test
    public void testGetDust() {
        assertEquals("Le Dust devrait être 4000", 4000, pokemon.getDust());
    }

    @Test
    public void testGetCandy() {
        assertEquals("Le Candy devrait être 4", 4, pokemon.getCandy());
    }

    @Test
    public void testGetIv() {
        assertEquals("L'IV devrait être 0.56", 0.56, pokemon.getIv(), 0.001);
    }
}
