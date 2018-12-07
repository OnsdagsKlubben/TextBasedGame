package game;

/**
 * The abstract class is used for insuring that subclasses has overridden methods such as
 * startAdventure, and access to a Player object, because some of these methods are called from other classes
 * such as GameManager.
 * @author Frederik Lundbeck
 */
public abstract class Game 
{
    protected Player player;

    public Game(Player player) 
    {
        this.player = player;
    }

    /**
     * the abstract method that must be implemented in subclasses
     */
    public abstract void startAdventure();
}