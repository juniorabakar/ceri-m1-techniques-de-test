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

    
        when(pokemonMetadataProvider.getPokemonMetadata(0)).thenReturn(expectedMetadata);

        PokemonMetadata actualMetadata = pokemonMetadataProvider.getPokemonMetadata(0);

        assertEquals("Les PokemonMetadata retournées doivent correspondre aux métadonnées attendues", expectedMetadata, actualMetadata);
    }
}
