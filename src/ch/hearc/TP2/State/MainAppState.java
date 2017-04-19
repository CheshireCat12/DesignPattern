package ch.hearc.TP2.State;

public class MainAppState
{
    public static void main(String[] args)
    {
        Command command = new Command();
        command.process();
        command.process();
        command.process();
    }
}
