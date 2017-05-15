package command;

/**
 * Created by Administrator on 2017/5/15.
 */
public abstract class Command {
    private Reciver reciver;
    public abstract void execute();

    public Reciver getReciver() {
        return reciver;
    }

    public void setReciver(Reciver reciver) {
        this.reciver = reciver;
    }
}
