package ch.hearc.TP3.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class FactorySoup extends AbstractFactory
{

    public FactorySoup()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Vegetable> createVegetables()
    {
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(new Onion());
        vegetables.add(new Tomato());
        return vegetables;
    }

    @Override
    public Spice createSpice()
    {
        return new Harissa();
    }

    @Override
    public Oil createOil()
    {
        return new Elbow();
    }

}
