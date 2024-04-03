package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import org.junit.Test;

public class PokedexFactoryTest {

    @Test
    public void testCreatePokedex() {
        PokedexFactory factory = new PokedexFactory();
        IPokedex pokedex = factory.createPokedex(new PokemonMetadataProvider(), new PokemonFactory());

        assertNotNull(pokedex);
        // Test the pokedex for different methods as needed.
    }
}
