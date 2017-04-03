package ch.hearc.TP2.State;

public class InWait implements State
{
    @Override
    public void processed(Command wrapper)
    {
        wrapper.setState(new Paid());
    }

}
