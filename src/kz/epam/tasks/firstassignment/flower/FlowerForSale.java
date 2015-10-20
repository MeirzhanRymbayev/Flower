package kz.epam.tasks.firstassignment.flower;

/**
 * Created by Meirzhan Rymbaev on 13.10.15.
 *
 * @author Meirzhan Rymbaev
 * @version 1.0 13.07.2015
 */
public class FlowerForSale extends AbstractFlower {
    private String color;
    private Integer price;
    private Integer freshnessLevel;
    private Integer stemLength;
    private Integer quantity;

    /**
     * @param name           name of the flower
     * @param color          color of the flower
     * @param price          price of the flower
     * @param freshnessLevel the level of the freshness of the flower
     * @param stemLength     length of the stem of the flower
     * @param quantity       quantity of the flower
     */
    public FlowerForSale(String name, String color, Integer price, Integer freshnessLevel, Integer stemLength, Integer quantity) {
        super(name);
        this.color = color;
        this.price = price;
        this.freshnessLevel = freshnessLevel;
        this.stemLength = stemLength;
        this.quantity = quantity;
    }

    public Integer getPrice(){
        return this.price;
    }

    public String getColor()
    {
        return this.color;
    }

    public Integer getFreshnessLevel()
    {
        return this.freshnessLevel;
    }

    public Integer getStemLength()
    {
        return this.stemLength;
    }

    public Integer getQuantity()
    {
        return this.quantity;
    }

    @Override
    public String toString()
    {
        return this.color + " " + this.getName() + ", длина стебля " + " равна " + this.getStemLength() + " см.";
    }
}
