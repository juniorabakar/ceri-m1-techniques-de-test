/*package fr.univavignon.pokedex.api;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class IPokemonTrainerFactoryTest {

    @Test
    public void testCreateTrainer() {
        // Création du mock de l'interface IPokemonTrainerFactory
        IPokemonTrainerFactory trainerFactory = mock(IPokemonTrainerFactory.class);

        // Définition du comportement du mock
        when(trainerFactory.createTrainer("Sacha")).thenReturn(new PokemonTrainer("Sacha"));

        // Utilisation du mock dans le test
        IPokemonTrainer trainer = trainerFactory.createTrainer("Sacha");

        // Assertions
        assertEquals("Sacha", trainer.getName());
    }
}
*/