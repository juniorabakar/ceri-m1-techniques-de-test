package fr.univavignon.pokedex.api;
/**
 * Factory class for creating instances of a Pokedex.
 */
public class PokedexFactory implements IPokedexFactory {

    @Override
    public IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
        return new Pokedex();
    }
}
