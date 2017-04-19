package ch.hearc.TP3.abstractFactory;

import java.util.List;

public abstract class AbstractFactory
{

    private static final FactoryCooking MENU_COOKING = new FactoryCooking();
    private static final FactorySalad MENU_SALAD = new FactorySalad();
    private static final FactorySoup MENU_SOUP = new FactorySoup();
    private static final FactorySteam MENU_STEAM = new FactorySteam();
    
    static AbstractFactory getFactory(Menu _menu)
    {
        AbstractFactory factory = null;
        switch (_menu)
        {
        case COOKING:
            factory = MENU_COOKING;
            break;
        case SALAD:
            factory = MENU_SALAD;
            break;
        case SOUP:
            factory = MENU_SOUP;
            break;
        case STEAM:
            factory = MENU_STEAM;
            break;
        default:
            break;
        }
        return factory;
    }
    
    public abstract List<Vegetable> createVegetables();
    public abstract Spice createSpice();
    public abstract Oil createOil();

}
