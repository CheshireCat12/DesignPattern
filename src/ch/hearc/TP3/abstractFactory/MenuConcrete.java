package ch.hearc.TP3.abstractFactory;

import java.util.List;

public class MenuConcrete
{
    protected List<Vegetable> vegetables;
    protected Spice spice;
    protected Oil oil;

    public MenuConcrete(AbstractFactory _factory)
    {
        vegetables = _factory.createVegetables();
        oil = _factory.createOil();
        spice = _factory.createSpice();
    }

    public void ShowMenu()
    {
        System.out.println("/************** Ingredient's list **************\\");
        System.out.println("");
        System.out.println("Spice : "+spice.getName());
        System.out.println("Oil : "+oil.getName());
        System.out.println("Vegetable : ");
        for (Vegetable vegetable : vegetables)
        {
            System.out.println("\t"+vegetable.getName());
        }
        System.out.println();
    }
}
