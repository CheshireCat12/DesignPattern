package ch.hearc.TP2.Decorator;

import ch.hearc.TP2.Decorator.Fruit;
import ch.hearc.TP2.Decorator.SimpleFruit;

public class MainAppDecorator
{

    public static void main(String[] args)
    {
        Fruit banana = new SimpleFruit("Banana", false);
        Fruit cherry = new SimpleFruit("Cherry", true);
        Fruit apple = new SimpleFruit("Apple", true);
        System.out.println(apple.toString());
        
        apple = new FirstDecorator(apple);
        System.out.println(apple.toString());
        
        banana = new SecondDecorator(banana);
        System.out.println(banana.toString());
        
        cherry = new ThirdDecorator(new SecondDecorator(new FirstDecorator(cherry)));
        System.out.println(cherry.toString());
        
    }

}
