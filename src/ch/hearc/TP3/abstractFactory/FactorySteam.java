package ch.hearc.TP3.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class FactorySteam extends AbstractFactory
{

    public FactorySteam()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Vegetable> createVegetables()
    {
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(new Tomato());
        vegetables.add(new Carrot());
        return vegetables;
    }

    @Override
    public Spice createSpice()
    {
        return new Curry();
    }

    @Override
    public Oil createOil()
    {
        return new Olive();
    }

}
