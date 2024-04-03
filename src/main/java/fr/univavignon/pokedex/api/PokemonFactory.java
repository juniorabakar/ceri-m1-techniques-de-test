package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory {

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        // Pour cet exemple, j'initialiserai ça avec des valeurs arbitraires ou basiques
    
        return new Pokemon(index, "Pikachu", 60, 70, 80, cp, hp, dust, candy, 1.0);
    }
}
