package edu.kit.informatik.bakerswalz.game.recipes;

/**
 * Modules a Bread that can be prepared by a baker. Contains the required 
 * ingredients for its preparation and assigns these values to the recipe
 * in the constructor.
 * 
 * @author Emilio Rivera
 * @version 1.0
 *
 */
public class Bread extends Recipes {
    
    /**
     * The required flour for a bread.
     */
    private static final int REQUIRED_FLOUR = 3;
    
    /**
     * The required eggs for a bread.
     */
    private static final int REQUIRED_EGGS = 0;
    
    /**
     * The required milk for a bread.
     */
    private static final int REQUIRED_MILK = 0;
    
    /**
     * The received earnings from preparing a bread.
     */
    private static final int EARNINGS = 10;
    
    /**
     * Constructor for a bread. Assigns the values of the required ingredients and earnings.
     */
    public Bread() {
        requiredFlour = REQUIRED_FLOUR;
        requiredEggs = REQUIRED_EGGS;
        requiredMilk = REQUIRED_MILK;
        earnings = EARNINGS;
    }
}