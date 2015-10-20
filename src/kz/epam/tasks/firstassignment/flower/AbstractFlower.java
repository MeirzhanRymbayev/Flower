package kz.epam.tasks.firstassignment.flower;

/**
 * The abstract class of the flowers hierarhy
 *
 * @version 1.0 13.07.2015
 * @author Meirzhan Rymbaev
 */
public abstract class AbstractFlower
{
    private String name;


    /**
     * Constructor of the AbstractFlower class
     * @param name name of the flower
     */
    public AbstractFlower(String name){
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
