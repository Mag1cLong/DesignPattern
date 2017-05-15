package command;

/**
 * Created by Administrator on 2017/5/15.
 */
public class CommandA extends Command {
    @Override
    public void execute() {
        getReciver().doCommand(this.getClass().getName());
    }
}
