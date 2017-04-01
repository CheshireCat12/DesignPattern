package ch.hearc.TP2.Composite;

public class MainAppComposite
{
    public static void main(String[] args)
    {
        SimpleFruit strawberry = new SimpleFruit("Strawberry", false);
        SimpleFruit banana = new SimpleFruit("Banana", false);
        SimpleFruit apple = new SimpleFruit("Apple", true);
        
        SimpleFruit[] basketFruit = {strawberry,banana,apple};
        Basket basket = new Basket(basketFruit);
        
        System.out.println(basket.toString());
        System.out.println(basket.holdSeed());

    }

}
