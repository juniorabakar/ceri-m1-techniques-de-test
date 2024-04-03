package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PokemonMetadataProviderTest {

    private PokemonMetadataProvider metadataProvider;

    @Before
    public void setUp() {
        metadataProvider = new PokemonMetadataProvider();
    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        PokemonMetadata metadata = metadataProvider.getPokemonMetadata(0);
        assertNotNull(metadata);
        assertEquals("Bulbizarre", metadata.getName());
    }

    @Test(expected = PokedexException.class)
    public void testGetPokemonMetadataWithInvalidId() throws PokedexException {
        metadataProvider.getPokemonMetadata(999);
    }
}
