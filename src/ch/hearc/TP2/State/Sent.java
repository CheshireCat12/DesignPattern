package ch.hearc.TP2.State;

public class Sent implements State
{
    @Override
    public void process(Command wrapper)
    {
        wrapper.setState(new InWait());
        System.out.println("SENT");
    }

}
