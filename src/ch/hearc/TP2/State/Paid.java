package ch.hearc.TP2.State;

public class Paid implements State
{

    @Override
    public void processed(Command wrapper)
    {
        wrapper.setState(new Sent());
        System.out.println("DONE");
    }

}
