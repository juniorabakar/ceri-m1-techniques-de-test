package fr.univavignon.pokedex.api;

/**
 * Pokemon POJO.
 * 
 * @author fv
 */
public final class Pokemon extends PokemonMetadata {

    /** Combat Point of the pokemon. **/
    private final int cp;

    /** HP of the pokemon. **/
    private final int hp;

    /** Required dust for upgrading this pokemon. **/
    private final int dust;

    /** Required candy for upgrading this pokemon. **/
    private final int candy;

    /** IV perfection percentage. **/
    private final double iv;
    
    /**
     * Default constructor.
     * 
     * @param index Pokemon index.
     * @param name Pokemon name.
     * @param attack Attack level.
     * @param defense Defense level.
     * @param stamina Stamina level.
     * @param cp Pokemon cp.
     * @param hp Pokemon hp.
     * @param dust Required dust for upgrading this pokemon.
     * @param candy Required candy for upgrading this pokemon.
     * @param iv IV perfection percentage.
     */
    public Pokemon(
            final int index,
            final String name,
            final int attack,
            final int defense,
            final int stamina,
            final int cp,
            final int hp,
            final int dust,
            final int candy,
            final double iv) {
        super(index, name, attack, defense, stamina);
        this.cp = cp;
        this.hp = hp;
        this.dust = dust;
        this.candy = candy;
        this.iv = iv;
    }
    

    /** 
     * Gets the Combat Point of the pokemon.
     * @return the Combat Point of the pokemon
     */
    public int getCp() {
        return cp;
    }
    
    /** 
     * Gets the HP of the pokemon.
     * @return the HP of the pokemon
     */
    public int getHp() {
        return hp;
    }

    /** 
     * Gets the required dust for upgrading this pokemon.
     * @return the required dust for upgrading
     */
    public int getDust() {
        return dust;
    }

    /** 
     * Gets the required candy for upgrading this pokemon.
     * @return the required candy for upgrading
     */
    public int getCandy() {
        return candy;
    }
    
    /** 
     * Gets the IV perfection percentage.
     * @return the IV perfection percentage
     */
    public double getIv() {
        return iv;
    }
    
}