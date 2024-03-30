package fr.univavignon.pokedex.api;

/**
 * Pokemon metadata POJO.
 * 
 * @author fv
 */
public class PokemonMetadata {

    /** Pokemon index. **/
    private final int index;

    /** Pokemon name. **/
    private final String name;

    /** Pokemon attack level. **/
    private final int attack;

    /** Pokemon defense level. **/
    private final int defense;

    /** Pokemon stamina level. **/
    private final int stamina;

    /**
     * Default constructor.
     * 
     * @param index Pokemon index.
     * @param name Pokemon name.
     * @param attack Attack level.
     * @param defense Defense level.
     * @param stamina Stamina level.
     */
    public PokemonMetadata(final int index, final String name, final int attack, final int defense, final int stamina) {
        this.index = index;
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.stamina = stamina;
    }

    /**
     * Default constructor setting default values.
     */
    public PokemonMetadata() {
        this.index = 0;
        this.name = "Pikachu";
        this.attack = 0;
        this.defense = 0;
        this.stamina = 0;
    }

    /**
     * Gets the Pokemon's index.
     * 
     * @return The index of the Pokemon.
     */
    public int getIndex() {
        return index;
    }

    /**
     * Gets the Pokemon's name.
     * 
     * @return The name of the Pokemon.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the Pokemon's attack level.
     * 
     * @return The attack level of the Pokemon.
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Gets the Pokemon's defense level.
     * 
     * @return The defense level of the Pokemon.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Gets the Pokemon's stamina level.
     * 
     * @return The stamina level of the Pokemon.
     */
    public int getStamina() {
        return stamina;
    }

}
