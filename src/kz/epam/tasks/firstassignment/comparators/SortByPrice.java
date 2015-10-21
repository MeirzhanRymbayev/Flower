package kz.epam.tasks.firstassignment.comparators;

import kz.epam.tasks.firstassignment.flower.FlowerForSale;

import java.util.Comparator;

/**
 * Created by Meirzhan Rymbaev on 13.10.15.
 * Comparator to sort by price
 * @author Meirzhan Rymbaev
 * @version 1.0 13.07.2015
 */
public class SortByPrice implements Comparator<FlowerForSale>
{
    @Override
    public int compare(FlowerForSale o1, FlowerForSale o2)
    {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
