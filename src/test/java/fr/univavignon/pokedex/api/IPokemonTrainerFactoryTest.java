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
//Test pour vérifier si tout va bien
    @Before
    public void setUp() {
        trainerFactory = mock(IPokemonTrainerFactory.class);
        pokedexFactory = mock(IPokedexFactory.class);
    }

    @Test
    public void testCreateTrainer() {
        String name = "Ash Ketchum";//Ou sacha du Bourg-Palette c'est vous qui voyez!
        Team team = Team.VALOR;
        IPokemonMetadataProvider metadataProvider = mock(IPokemonMetadataProvider.class);
        IPokemonFactory pokemonFactory = mock(IPokemonFactory.class);

        IPokedex pokedex = mock(IPokedex.class);
        when(pokedexFactory.createPokedex(metadataProvider, pokemonFactory)).thenReturn(pokedex);

        //Je crée un PokemonTrainer simulé pour l'usine
        PokemonTrainer expectedTrainer = new PokemonTrainer(name, team, pokedex);

    
        when(trainerFactory.createTrainer(name, team, pokedexFactory)).thenReturn(expectedTrainer);

        PokemonTrainer trainer = trainerFactory.createTrainer(name, team, pokedexFactory);

        assertNotNull("Le dresseur créé ne devrait pas être nul", trainer);
        assertEquals("Le nom du dresseur devrait être 'Ash Ketchum'", name, trainer.getName());
        assertEquals("L'équipe du dresseur devrait être 'Team.VALOR'", team, trainer.getTeam());
    }
    @Test
    public void testGetPokedex() {
        String name = "Ash Ketchum";
        Team team = Team.VALOR;
        IPokemonMetadataProvider metadataProvider = mock(IPokemonMetadataProvider.class);
        IPokemonFactory pokemonFactory = mock(IPokemonFactory.class);
    
        IPokedex pokedex = mock(IPokedex.class);
        when(pokedexFactory.createPokedex(metadataProvider, pokemonFactory)).thenReturn(pokedex);
    
        PokemonTrainer expectedTrainer = new PokemonTrainer(name, team, pokedex);
        when(trainerFactory.createTrainer(name, team, pokedexFactory)).thenReturn(expectedTrainer);
    
        PokemonTrainer trainer = trainerFactory.createTrainer(name, team, pokedexFactory);
    
        assertNotNull("Le pokedex du dresseur ne devrait pas être nul", trainer.getPokedex());
        assertEquals("Le pokedex du dresseur devrait être celui qui a été simulé", pokedex, trainer.getPokedex());
    }
    
}
