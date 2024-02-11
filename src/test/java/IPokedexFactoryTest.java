/*package fr.univavignon.pokedex.api;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class IPokedexFactoryTest {
    @Test
    public void testCreatePokedex() {
        // Création du mock de l'interface IPokedexFactory
        IPokedexFactory pokedexFactory = mock(IPokedexFactory.class);

        // Définition du comportement du mock
        when(pokedexFactory.createPokedex(any())).thenReturn(new Pokedex());

        // Utilisation du mock dans le test
        IPokedex pokedex = pokedexFactory.createPokedex(null);

        // Assertions
        assertNotNull(pokedex);
    }
}
*/