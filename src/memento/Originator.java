package memento;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Originator {
    private int state;

    public void currentState() {
        System.out.println("查看状态：" + state);
    }

    public Memento save() {
        System.out.println("已存档");
        Memento memento = new Memento();
        memento.setState(getState());
        return memento;
    }

    public void recove(Memento memento) {
        System.out.println("已回档");
        setState(memento.getState());
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        System.out.println("设置状态："+state);
        this.state = state;
    }
}
