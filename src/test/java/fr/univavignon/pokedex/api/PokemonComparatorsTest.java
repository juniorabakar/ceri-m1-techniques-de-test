package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PokemonComparatorsTest {

    @Test
    public void testCompareByName() {
        Pokemon pokemon1 = new Pokemon(0, "Bulbizarre", 0, 0, 0, 0, 0, 0, 0, 0);
        Pokemon pokemon2 = new Pokemon(0, "Salamèche", 0, 0, 0, 0, 0, 0, 0, 0);
        
        int comparison = PokemonComparators.NAME.compare(pokemon1, pokemon2);
        assertTrue("Bulbizarre devrait venir avant Salamèche normalement!", comparison < 0);
    }

    @Test
    public void testCompareByIndex() {
        Pokemon pokemon1 = new Pokemon(1, "Bulbizarre", 0, 0, 0, 0, 0, 0, 0, 0);
        Pokemon pokemon2 = new Pokemon(4, "Salamèche", 0, 0, 0, 0, 0, 0, 0, 0);
        
        int comparison = PokemonComparators.INDEX.compare(pokemon1, pokemon2);
        assertTrue("Bulbizarre devrait venir après Salamèche normalement!", comparison < 0);
    }

    @Test
    public void testCompareByCp() {
        Pokemon pokemon1 = new Pokemon(0, "Bulbizarre", 0, 0, 0, 500, 0, 0, 0, 0);
        Pokemon pokemon2 = new Pokemon(0, "Salamèche", 0, 0, 0, 300, 0, 0, 0, 0);
        
        int comparison = PokemonComparators.CP.compare(pokemon1, pokemon2);
        assertTrue("Bulbizarre devrait avoir plus de CP que Salamèche normalement!", comparison > 0);
    }
}
