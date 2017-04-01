package ch.hearc.TP2.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket implements Fruit
{
    protected final List<Fruit> basket;
    
    public Basket()
    {
        basket = new ArrayList<Fruit>();
    }
    
    public Basket(List<Fruit> _basket)
    {
        basket = new ArrayList<Fruit>(_basket);
    }
    
    @Override
    public String toString()
    {   
        StringBuffer temp = new StringBuffer();
        temp.append("Panier [ ");
        for (Fruit fruit : basket)
        {
            temp.append(fruit.toString()+ " ");
        }
        temp.append("]");
        return temp.toString();
    }

    @Override
    public boolean holdSeed()
    {
        return Arrays.stream(basket.toArray(new Fruit[basket.size()])).anyMatch(Fruit -> Fruit.holdSeed());
    }

    public void addChild(Fruit _fruit)
    {
        basket.add(_fruit);
    }
    
    public void removeChild(Fruit _fruit)
    {
        basket.remove(_fruit);
    }
    

}
