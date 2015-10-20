package kz.epam.tasks.firstassignment;
/*	Цветочница.
        Определить иерархию цветов.
        Создать несколько объектов-цветов. // Создаются в классе FlowerSeller
        Собрать букет (используя аксессуары) с определением его стоимости. // Собирает FlowerSeller
        Провести сортировку цветов в букете на основе уровня свежести. // Сортируется в Bouquet
        Найти цветок в букете, соответствующий заданному диапазону длин стеблей. // Занимается этим сам букет
*/

import kz.epam.tasks.firstassignment.comparators.SortByFreshness;
import kz.epam.tasks.firstassignment.comparators.SortByPrice;

/**
 * Created by Meirzhan Rymbaev on 13.10.15.
 *
 * @author Meirzhan Rymbaev
 * @version 1.0 13.07.2015
 */
public class Main
{
    public static void main(String[] args)
    {
        TheFlowerSeller flowerSeller = new TheFlowerSeller("Olya");
        Bouquet bouquet = flowerSeller.makeBouquet();


        flowerSeller.showBouquet(bouquet); // Порядок цветов без применения сортировок
        bouquet.sort(new SortByFreshness());    // Сортировка по уровню свежести.
        bouquet.sort(new SortByPrice());  // Сортировка цветов в букете по ценам
        flowerSeller.showBouquet(bouquet);
        bouquet.showPrice();  // Показать стоимость букета

        bouquet.showFlowerByStemLength(91, 96);

    }
}
