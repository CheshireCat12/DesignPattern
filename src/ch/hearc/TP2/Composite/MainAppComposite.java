package ch.hearc.TP2.Composite;

import java.util.ArrayList;
import java.util.List;

public class MainAppComposite
{
    public static void main(String[] args)
    {
        SimpleFruit strawberry = new SimpleFruit("Strawberry", false);
        SimpleFruit banana = new SimpleFruit("Banana", false);
        SimpleFruit apple = new SimpleFruit("Apple", true);
        
        List<Fruit> basketFruit = new ArrayList<Fruit>();
        basketFruit.add(strawberry);
        basketFruit.add(banana);
        basketFruit.add(apple);
        
        Basket basket = new Basket(basketFruit);
        Basket basket2 = new Basket();
        basket2.addChild(basket);
        
        System.out.println(basket.toString());
        System.out.println(basket2.toString());
        System.out.println(basket.holdSeed());

    }

}
