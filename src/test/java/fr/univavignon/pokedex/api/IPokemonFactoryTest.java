package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class IPokemonFactoryTest {

    private IPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokemonFactory = mock(IPokemonFactory.class);
    }

    @Test
    //Test avec un index négatif pour voir ce que j'obtiens
    public void testCreatePokemon() {
        Pokemon expectedPokemon = new Pokemon(
            -151,              // Index
            "Bulbasaur",    // Nom
            16,             // Niveau d'attaque
            16,             // Niveau de défense
            16,             // Niveau d'endurance
            100,            // Niveau de combat
            100,            // Niveau de vie
            100,            // Niveau de poussière d'étoile
            50,             // Nombre de bonbons
            0.8             // Pourcentage de perfection
        );
        
        when(pokemonFactory.createPokemon(100,100,100,100,100)).thenReturn(expectedPokemon);

        Pokemon actualPokemon = pokemonFactory.createPokemon(100,100,100,100,100);
        assertEquals("The returned Pokemon should match the expected Pokemon", expectedPokemon, actualPokemon);
    }
}
