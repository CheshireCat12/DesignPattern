package ch.hearc.TP3.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class FactoryCooking extends AbstractFactory
{

    public FactoryCooking()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Vegetable> createVegetables()
    {
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(new Onion());
        vegetables.add(new Carrot());
        return vegetables;
    }

    @Override
    public Spice createSpice()
    {
        return new Salt();
    }

    @Override
    public Oil createOil()
    {
        return new Olive();
    }

}
