package fr.univavignon.pokedex.api;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class PokemonTrainerFactoryTest {

    @Test
    public void testCreateTrainer() {
        IPokedexFactory pokedexFactory = mock(IPokedexFactory.class);
        when(pokedexFactory.createPokedex(any(), any())).thenReturn(new Pokedex());
        
        PokemonTrainerFactory trainerFactory = new PokemonTrainerFactory(pokedexFactory);
        PokemonTrainer trainer = trainerFactory.createTrainer("Ash", Team.VALOR, pokedexFactory);

        assertNotNull(trainer);
        assertEquals("Ash", trainer.getName());
        assertEquals(Team.VALOR, trainer.getTeam());
        assertNotNull(trainer.getPokedex());
    }
}
