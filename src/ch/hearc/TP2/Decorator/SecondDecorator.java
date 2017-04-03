package ch.hearc.TP2.Decorator;

import ch.hearc.TP2.Decorator.Fruit;

public class SecondDecorator extends DecoratorFruit
{

    public SecondDecorator(Fruit _basket)
    {
        super(_basket);
    }

    @Override
    public String toString()
    {
        return "< " + super.toString() + " / "
                + ((super.holdSeed() == true) ? "with seed" : "without seed")
                + " >";
    }

}
