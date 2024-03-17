package fr.univavignon.pokedex.api;
import java.util.Collections; 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Pokedex implements IPokedex {
    private List<Pokemon> pokemons = new ArrayList<>();

    @Override
    public int size() {
        return pokemons.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
        return pokemons.indexOf(pokemon);
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        if (id < 0 || id >= size()) {
            throw new PokedexException("ID invalide...");
        }
        return pokemons.get(id);
    }

    @Override
    public List<Pokemon> getPokemons() {
        return Collections.unmodifiableList(new ArrayList<>(pokemons));
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        return pokemons.stream().sorted(order).collect(Collectors.toList());
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        // Ceci est une implémentation de base.
        return new Pokemon(index, "Pikachu", cp, hp, dust, candy, 0, 0, 0, 0);
    }

    // Implémentation de IPokemonMetadataProvider
    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (index < 0 || index >= 151) { // Supposons qu'il y ait 151 Pokémons comme dans la première génération!
            throw new PokedexException("Pokemon index non valide...");
        }
        return new PokemonMetadata(index, "Pikachu", 123, 123, 123);
    }
}
