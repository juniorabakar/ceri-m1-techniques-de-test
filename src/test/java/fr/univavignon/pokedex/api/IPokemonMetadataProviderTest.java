package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class IPokemonMetadataProviderTest {

    private IPokemonMetadataProvider pokemonMetadataProvider;

    @Before
    public void setUp() {
        pokemonMetadataProvider = mock(IPokemonMetadataProvider.class);
    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        PokemonMetadata expectedMetadata = new PokemonMetadata();

        // Mocking the behavior of getPokemonMetadata method
        when(pokemonMetadataProvider.getPokemonMetadata(0)).thenReturn(expectedMetadata);

        // Calling the method to get PokemonMetadata
        PokemonMetadata actualMetadata = pokemonMetadataProvider.getPokemonMetadata(0);

        // Asserting that the returned metadata is correct
        assertEquals("The returned PokemonMetadata should match the expected metadata", expectedMetadata, actualMetadata);
    }
}
