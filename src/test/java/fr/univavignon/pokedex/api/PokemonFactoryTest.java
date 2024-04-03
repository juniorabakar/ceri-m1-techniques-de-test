package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import org.junit.Test;

public class PokemonFactoryTest {

    @Test
    public void testCreatePokemon() {
        PokemonFactory factory = new PokemonFactory();

        int index = 25;
        int cp = 500;
        int hp = 60;
        int dust = 3000;
        int candy = 50;
        Pokemon pokemon = factory.createPokemon(index, cp, hp, dust, candy);

        assertNotNull("Le pokemon crée ne devrait pas être nul", pokemon);
        assertEquals("L'index devrait être 25", index, pokemon.getIndex());
        assertEquals("Le CP du Pokemon doit être 500", cp, pokemon.getCp());
        assertEquals("Le hp du Pokemon doit être 60", hp, pokemon.getHp());
        assertEquals("Le dust du Pokémon doit être 3000", dust, pokemon.getDust());
        assertEquals("Le candy du pokémon doit être 50", candy, pokemon.getCandy());

        assertEquals("L'attaque devrait être 60", 60, pokemon.getAttack());
        assertEquals("La défense devrait être 70", 70, pokemon.getDefense());
        assertEquals("L'endurance devrait être 80", 80, pokemon.getStamina());
        assertEquals("L'iv devrait être 1.0", 1.0, pokemon.getIv(), 0.0);
    }
}
