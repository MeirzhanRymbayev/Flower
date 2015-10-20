package kz.epam.tasks.firstassignment;

import kz.epam.tasks.firstassignment.flower.FlowerForSale;

/**
 * This class create who sell the flowers
 * Created by Meirzhan Rymbaev on 13.10.15.
 *
 * @author Meirzhan Rymbaev
 * @version 1.0 13.07.2015
 *
 */
public class TheFlowerSeller
{
    private String name;

    public TheFlowerSeller(String name)
    {
        this.name = name;
    }

    /**
     * makeBouquet()
     * The method makes bouquets.
     * @return Method return Bouquet with added flowers
     */
    public Bouquet makeBouquet()
    {

        Bouquet bouquet = new Bouquet();
        bouquet.add(new FlowerForSale("Роза", "Белая", 550, 2, 90, 7));
        bouquet.add(new FlowerForSale("Роза", "Красная", 500, 5, 95, 15));
        bouquet.add(new FlowerForSale("Роза", "Спрей", 800, 3, 80, 3));
        bouquet.add(new FlowerForSale("Тюлпан", "Желтый", 600, 4, 90, 7));

        return bouquet;
    }

    /**
     * Method print text about bouquet
     * @param bouquet
     */
    public void showBouquet(Bouquet bouquet){
        System.out.println(bouquet);
        System.out.println();
    }

}
