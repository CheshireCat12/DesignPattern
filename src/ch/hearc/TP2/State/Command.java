package ch.hearc.TP2.State;

public class Command
{
    private State currentState;

    public Command()
    {
        currentState = new InWait();
    }

    public void setState(State _state)
    {
        currentState = _state;
    }
    
    public void process()
    {
        currentState.process(this);
    }

}
