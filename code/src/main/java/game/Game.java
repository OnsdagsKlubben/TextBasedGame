package game;

public abstract class Game 
{
    protected Player player;

    public Game(Player player) 
    {
        this.player = player;
    }

    public abstract void startAdventure();
}