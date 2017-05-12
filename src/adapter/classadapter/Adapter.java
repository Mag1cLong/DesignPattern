package adapter.classadapter;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        this.specificRequest();
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.request();
    }
}
