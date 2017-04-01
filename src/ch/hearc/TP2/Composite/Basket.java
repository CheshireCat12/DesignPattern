package ch.hearc.TP2.Composite;

import java.util.Arrays;

public class Basket implements Fruit
{
    protected final Fruit[] basket;
    
    public Basket(Fruit[] _basket)
    {
        int sizeArray = _basket.length;
        this.basket = new Fruit[sizeArray];
        System.arraycopy(_basket, 0, this.basket, 0, sizeArray);
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
        //System.out.println(Arrays.asList(basket).contains(true));
        boolean temp = false;
        for (Fruit fruit : basket)
        {
            temp = temp | fruit.holdSeed();
        }
        return temp;
    }


}
