package ch.hearc.TP2.Composite;

public class Basket implements Fruit
{
    protected final Fruit[] basket;
    
    public Basket(Fruit[] _basket)
    {
        this.basket = _basket;
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
        boolean temp = false;
        for (Fruit fruit : basket)
        {
            temp = temp | fruit.holdSeed();
        }
        return temp;
    }


}
