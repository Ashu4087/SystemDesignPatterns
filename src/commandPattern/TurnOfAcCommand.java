package commandPattern;

/**
 * It will implement the command and has idea for which object it gonna execute command
 */
public class TurnOfAcCommand implements Command{
    AirConditioner ac;

    public TurnOfAcCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOfAc();
    }
}
