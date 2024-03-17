package fr.univavignon.pokedex.api;

import java.util.HashMap;
import java.util.Map;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {

    private Map<Integer, PokemonMetadata> metadataMap;

    public PokemonMetadataProvider() {
        metadataMap = new HashMap<>();
        // Par exemple:
        metadataMap.put(0, new PokemonMetadata(0, "Bulbizarre", 126, 126, 90));
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (!metadataMap.containsKey(index)) {
            throw new PokedexException("Metadata for Pokemon index " + index + " not found.");
        }
        return metadataMap.get(index);
    }
}
