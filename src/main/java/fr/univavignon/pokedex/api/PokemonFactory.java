package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory {

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        // Pour cet exemple, j'initialiserai ça avec des valeurs arbitraires ou basiques
    
        return new Pokemon(index, "Pikachu", cp, hp, dust, candy, 60, 70, 80, 1.0);
    }
}
