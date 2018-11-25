package gameobjects.items.weapons;

import gameobjects.items.Item;

public class Weapon extends Item
{
    protected int damage;

    public Weapon(String name, String description, double weight, int damage) 
    {
        super(name, description, weight);
        this.damage = damage;
    }

    public int getDamage()
    {
        return damage;
    }
}