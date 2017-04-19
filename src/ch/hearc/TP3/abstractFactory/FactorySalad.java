package ch.hearc.TP3.abstractFactory;

import java.util.ArrayList;
import java.util.List;


public class FactorySalad extends AbstractFactory
{

    public FactorySalad()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Vegetable> createVegetables()
    {
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(new Carrot());
        vegetables.add(new Tomato());
        vegetables.add(new Lettuce());
        return vegetables;
    }

    @Override
    public Spice createSpice()
    {
        return new Pepper();
    }

    @Override
    public Oil createOil()
    {
        return new Olive();
    }

}
