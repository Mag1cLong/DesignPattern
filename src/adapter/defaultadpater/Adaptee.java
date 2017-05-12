package adapter.defaultadpater;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Adaptee extends Adapter {
    @Override
    public void a() {
        System.out.println("invoke a....");
    }

    public static void main(String[] args) {
        Target adaptee = new Adaptee();
        adaptee.a();
    }
}
