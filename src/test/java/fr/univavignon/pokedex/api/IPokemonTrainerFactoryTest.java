package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class IPokemonTrainerFactoryTest {

    private IPokemonTrainerFactory trainerFactory;
    private IPokedexFactory pokedexFactory;

    @Before
    public void setUp() {
        trainerFactory = mock(IPokemonTrainerFactory.class);
        pokedexFactory = mock(IPokedexFactory.class);
    }

    @Test
    public void testCreateTrainer() {
        String name = "Ash Ketchum";
        Team team = Team.VALOR;
        IPokemonMetadataProvider metadataProvider = mock(IPokemonMetadataProvider.class);
        IPokemonFactory pokemonFactory = mock(IPokemonFactory.class);

        // Définir le comportement attendu lors de l'appel de la méthode createPokedex() sur la factory de pokedex
        IPokedex pokedex = mock(IPokedex.class);
        when(pokedexFactory.createPokedex(metadataProvider, pokemonFactory)).thenReturn(pokedex);

        // Créer un PokemonTrainer simulé pour l'usine
        PokemonTrainer expectedTrainer = new PokemonTrainer(name, team, pokedex);

        // Définir le comportement attendu lors de l'appel de la méthode createTrainer() sur la factory de dresseurs
        when(trainerFactory.createTrainer(name, team, pokedexFactory)).thenReturn(expectedTrainer);

        // Appeler la méthode createTrainer()
        PokemonTrainer trainer = trainerFactory.createTrainer(name, team, pokedexFactory);

        // Vérifier les assertions
        assertNotNull("Le dresseur créé ne devrait pas être nul", trainer);
        assertEquals("Le nom du dresseur devrait être 'Ash Ketchum'", name, trainer.getName());
        assertEquals("L'équipe du dresseur devrait être 'Team.VALOR'", team, trainer.getTeam());
    }
}
