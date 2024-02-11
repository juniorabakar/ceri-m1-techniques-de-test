/*package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class IPokedexTest {

    private IPokedex pokedex;

    @Before
    public void setUp() {
        // Initialisation de votre objet pokedex avant chaque test
        pokedex = new VotreImplementationDePokedex();
    }

    @Test
    public void testSize() {
        assertEquals("Le nombre de pokemons dans le pokedex devrait être 0 au départ", 0, pokedex.size());
    }

    @Test
    public void testAddPokemon() {
        Pokemon pokemon = new Pokemon();
       int index = pokedex.addPokemon(pokemon);
        assertEquals("L'index du pokemon ajouté devrait être 0", 0, index);
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        Pokemon pokemon = new Pokemon();
        pokedex.addPokemon(pokemon);
        assertEquals("Le pokemon retourné devrait être le même que celui ajouté", pokemon, pokedex.getPokemon(0));
    }

    @Test
    public void testGetPokemons() {
        List<Pokemon> pokemons = pokedex.getPokemons();
        assertNotNull("La liste de pokemons ne devrait pas être null", pokemons);
        assertEquals("La taille de la liste de pokemons devrait être 0", 0, pokemons.size());
    }

    @Test
    public void testGetPokemonsWithComparator() {
        Pokemon pokemon1 = new Pokemon();
        Pokemon pokemon2 = new Pokemon();
        pokedex.addPokemon(pokemon1);
        pokedex.addPokemon(pokemon2);

        Comparator<Pokemon> comparator = Comparator.comparing(Pokemon::getName);

        List<Pokemon> sortedPokemons = pokedex.getPokemons(comparator);
        assertNotNull("La liste triée de pokemons ne devrait pas être null", sortedPokemons);
        assertEquals("La taille de la liste triée de pokemons devrait être 2", 2, sortedPokemons.size());
        // Ajoutez des assertions pour vérifier l'ordre des pokemons dans la liste triée si nécessaire
    }
*/