package command;

/**
 * Created by Administrator on 2017/5/15.
 */
public class CommandB extends Command {
    @Override
    public void execute() {
        getReciver().undoCommand(this.getClass().getName());
    }
}
