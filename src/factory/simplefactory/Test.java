package factory.simplefactory;

/**
 * Created by Administrator on 2017/5/9.
 */
public class Test {
    public static void main(String[] args) {
        Product p1 = Factory.produce("Product1");
        p1.introduce();
        Product p2 = Factory.produce("Product2");
        p2.introduce();
    }
}
