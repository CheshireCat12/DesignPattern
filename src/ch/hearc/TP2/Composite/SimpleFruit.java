package ch.hearc.TP2.Composite;

public class SimpleFruit implements Fruit
{
    private String nameFruit;
    private boolean seed;
    
    public SimpleFruit(String _nameFruit,boolean _seed)
    {
        this.nameFruit = _nameFruit;
        this.seed = _seed;
    }
    
    @Override
    public String toString()
    {
        return nameFruit;
    }

    @Override
    public boolean holdSeed()
    {
        return seed;
    }

}
