package kz.epam.tasks.firstassignment;


import kz.epam.tasks.firstassignment.flower.FlowerForSale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Meirzhan Rymbaev on 13.10.15.
 *
 * @author Meirzhan Rymbaev
 * @version 1.0 13.07.2015
 */
public class Bouquet
{

    List<FlowerForSale> bouquet = new ArrayList<>();

    /**
     * Method add flower into List<FlowerForSale>
     *
     * @param flowerForSale it is flower which should be add into List
     * @return returns List with flowers which was added by method
     */
    public List<FlowerForSale> add(FlowerForSale flowerForSale)
    {
        bouquet.add(flowerForSale);
        return bouquet;
    }

    /**
     * Method sorts flowers in the bouquet by comparator
     */
    public void sort(Comparator<FlowerForSale> comparator)
    {
        Collections.sort(bouquet, comparator);
    }

    /**
     * Method prints into console summary cost of the bouquet
     */
    public void showPrice()
    {
        Integer bouquetPrice = 0;
        for (FlowerForSale flower : bouquet)
        {
            bouquetPrice += flower.getPrice() * flower.getQuantity();

        }
        System.out.println("Стоимость букета " + bouquetPrice + " тенге. Дарите на радость!");
    }


    /**
     * Method search FlowerForSale object in Bouquet by min and max length parameters
     *
     * @param min minimal length of the flower stem
     * @param max maximal length of the flower stem
     */
    public void showFlowerByStemLength(Integer min, Integer max)
    {
        Integer stemLength;

        for (FlowerForSale flowerForSale : this.bouquet)
        {
            stemLength = flowerForSale.getStemLength();
            if (stemLength >= min && stemLength <= max)
            {
                System.out.println(flowerForSale);
            }
        }
    }

    /**
     * Method returns readable String
     *
     * @return Method returns String view of this bouquet
     */
    @Override
    public String toString()
    {
        String result = "В букете: \n";
        for (FlowerForSale flower : bouquet)
        {
            result += flower.getColor() + " " + flower.getName()
                    + " " + flower.getQuantity() + " шт." +
                    " Уровень свежести " + flower.getFreshnessLevel() + "(в днях). Цена " + flower.getPrice() + " тг. за шт.\n";
        }
        return result;
    }
}
