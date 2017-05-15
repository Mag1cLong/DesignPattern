package memento;

/**
 * 备忘录模式
 * Created by Administrator on 2017/5/15.
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState(1);
        originator.currentState();
        Memento memento = originator.save();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);
        originator.setState(2);
        originator.currentState();
        originator.recove(caretaker.getMemento());
        originator.currentState();
    }
}
