package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokedexExceptionTest {

    @Test
    public void testPokedexExceptionMessage() {
        String errorMessage = "Une erreur s'est produite...";
        PokedexException exception = new PokedexException(errorMessage);
        
        assertEquals("L'erreur devrait correspondre à l'argument passé...", errorMessage, exception.getMessage());
    }
    
    @Test(expected = PokedexException.class)
    public void testPokedexExceptionIsThrown() throws PokedexException {
        throw new PokedexException("Une erreur s'est produite!");
    }
}
