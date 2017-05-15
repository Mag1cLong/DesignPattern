package command;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Invoker {
    private Command command;

    public void execute(){
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
