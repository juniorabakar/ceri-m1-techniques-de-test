package fr.univavignon.pokedex.api;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class IPokemonFactoryTest {

    @Test
    public void testCreatePokemon() {
        // Création du mock de l'interface IPokemonFactory
        IPokemonFactory pokemonFactory = mock(IPokemonFactory.class);

        // Définition du comportement du mock
        when(pokemonFactory.createPokemon(1, 50, 30, 40, 20)).thenReturn(new Pokemon(1, "Bulbasaur", 50, 30, 40, 20));

        // Utilisation du mock dans le test
        Pokemon bulbasaur = pokemonFactory.createPokemon(1, 50, 30, 40, 20);

        // Assertions
        assertEquals(1, bulbasaur.getIndex());
        assertEquals("Bulbasaur", bulbasaur.getName());
        assertEquals(50, bulbasaur.getAttack());
        assertEquals(30, bulbasaur.getDefense());
        assertEquals(40, bulbasaur.getStamina());
        assertEquals(20, bulbasaur.getCp());
    }
}
