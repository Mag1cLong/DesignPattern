package command;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Reciver {
    public void doCommand(String name){
        System.out.println("执行命令："+name);
    }

    public void undoCommand(String name){
        System.out.println("撤销命令："+name);
    }
}
