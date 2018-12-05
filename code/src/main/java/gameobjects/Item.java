package gameobjects;

public class Item 
{
    private boolean storable;
    private String name;
    private String description;

    public Item(String name, String description, boolean storable) 
    {
       this.name = name;
       this.description = description;
       this.storable = storable;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean isStorable()
    {
        return storable;
    }

    public void setStorable(boolean storable)
    {
        this.storable = storable;
    }

}