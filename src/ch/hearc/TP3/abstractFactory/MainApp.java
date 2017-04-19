package ch.hearc.TP3.abstractFactory;

public class MainApp
{

    public static void main(String[] args)
    {
        AbstractFactory factory = AbstractFactory.getFactory(Menu.STEAM);
        MenuConcrete menu = new MenuConcrete(factory);
        menu.ShowMenu();
        
        factory = AbstractFactory.getFactory(Menu.SALAD);
        MenuConcrete menu2 = new MenuConcrete(factory);
        menu2.ShowMenu();
    }

}
