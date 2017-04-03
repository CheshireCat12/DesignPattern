package ch.hearc.TP2.Decorator;

import ch.hearc.TP2.Decorator.Fruit;

public class FirstDecorator extends DecoratorFruit
{

    public FirstDecorator(Fruit _basket)
    {
        super(_basket);
    }

    @Override
    public String toString()
    {
        return "{ " + super.toString() + " | "
                + ((super.holdSeed() == true) ? "with seed"
                        : "without seed") + " }";
    }

}
