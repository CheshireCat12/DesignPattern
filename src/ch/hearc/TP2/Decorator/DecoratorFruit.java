package ch.hearc.TP2.Decorator;

import ch.hearc.TP2.Decorator.Fruit;

public abstract class DecoratorFruit implements Fruit
{
    protected final Fruit decoratedFruit;
    
    
    public DecoratorFruit(Fruit _Fruit)
    {
        decoratedFruit = _Fruit;
    }
    
    @Override
    public String toString()
    {
        return decoratedFruit.toString();   
    }
    

    @Override
    public boolean holdSeed()
    {
        return decoratedFruit.holdSeed();
    }

    
    

}
