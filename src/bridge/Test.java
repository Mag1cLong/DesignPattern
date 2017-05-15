package bridge;

/**
 * 桥接模式
 * Created by Administrator on 2017/5/15.
 */
public class Test {
    public static void main(String[] args) {
        Engine ng200 = new Engine200();
        Car bmw = new Bmw(ng200);
        bmw.install();
        Engine ng300 = new Engine300();
        Car benz = new Benz(ng300);
        benz.install();
    }
}
