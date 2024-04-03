package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PokemonMetadataTest {

    private PokemonMetadata metadata;

    @Before
    public void setUp() {
        metadata = new PokemonMetadata(0, "Bulbizarre", 118, 111, 128);
    }

    @Test
    public void testGetIndex() {
        assertEquals("L'index devrait être 0", 0, metadata.getIndex());
    }

    @Test
    public void testGetAttack() {
        assertEquals("L'attaque devrait être 118", 118, metadata.getAttack());
    }

    @Test
    public void testGetDefense() {
        assertEquals("La défense devrait être 111", 111, metadata.getDefense());
    }

    @Test
    public void testGetStamina() {
        assertEquals("L'endurance devrait être 128", 128, metadata.getStamina());
    }
}
