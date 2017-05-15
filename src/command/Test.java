package command;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Test {
    public static void main(String[] args) {
        Reciver reciver = new Reciver();
        Command a = new CommandA();
        a.setReciver(reciver);
        Command b = new CommandB();
        b.setReciver(reciver);
        Invoker invoker = new Invoker();
        invoker.setCommand(a);
        invoker.execute();
        invoker.setCommand(b);
        invoker.execute();
    }
}
