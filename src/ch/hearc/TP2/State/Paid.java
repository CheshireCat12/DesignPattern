package ch.hearc.TP2.State;

public class Paid implements State
{

    @Override
    public void process(Command wrapper)
    {
        wrapper.setState(new Sent());
        System.out.println("DONE");
    }

}
