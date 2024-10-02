package commandPattern;

public class TurnOnAcCommand implements Command{
    AirConditioner ac;
    public TurnOnAcCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();
    }
}
