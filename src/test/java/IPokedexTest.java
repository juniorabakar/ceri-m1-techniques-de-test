package fr.univavignon.pokedex.api;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class IPokedexTest {

    @Test
    public void testAddPokemon() {
        // Création du mock de l'interface IPokedex
        IPokedex pokedex = mock(IPokedex.class);

        // Utilisation du mock dans le test
        pokedex.addPokemon(new Pokemon());

        // Vérification que la méthode addPokemon a été appelée une fois
        verify(pokedex, times(1)).addPokemon(any());
    }
}
