package fr.univavignon.pokedex.api;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class IPokemonMetadataProviderTest {

    @Test
    public void testGetPokemonMetadata() {
        // Je crée mon mock
        IPokemonMetadataProvider pokemonMetadataProvider = mock(IPokemonMetadataProvider.class);

        // Définition du comportement du mock
        when(pokemonMetadataProvider.getPokemonMetadata(1)).thenReturn(new PokemonMetadata("Bulbasaur", 1, 45, 49, 49));

        // Utilisation du mock dans le test
        PokemonMetadata bulbasaurMetadata = pokemonMetadataProvider.getPokemonMetadata(1);

    
        assertEquals("Bulbasaur", bulbasaurMetadata.getName());
        assertEquals(1, bulbasaurMetadata.getIndex());
        assertEquals(45, bulbasaurMetadata.getAttack());
        assertEquals(49, bulbasaurMetadata.getDefense());
        assertEquals(49, bulbasaurMetadata.getStamina());
    }
}
