package fr.univavignon.pokedex.api;

public class PokemonTrainerFactory implements IPokemonTrainerFactory {

    @SuppressWarnings("unused")
    private IPokedexFactory pokedexFactory;

    public PokemonTrainerFactory(IPokedexFactory pokedexFactory) {
        this.pokedexFactory = pokedexFactory;
    }

    @Override
    public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
        IPokedex pokedex = pokedexFactory.createPokedex(new PokemonMetadataProvider(), new PokemonFactory());

      return new PokemonTrainer(name, team, pokedex);
    }
}
