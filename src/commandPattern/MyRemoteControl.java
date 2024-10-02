package commandPattern;

/**
 * This RemoteControl is basically an invoker which generates a command
 * It has command which it will execute to generate command
 */
public class MyRemoteControl {
    Command onCommand;
    Command offCommand;


    public MyRemoteControl(){

    }

    public void setCommand(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressButton(boolean isOn) {
        if(isOn) {
            onCommand.execute();
        } else {
            offCommand.execute();
        }

    }
}
