package factory.factorymethod;

/**
 * Created by Administrator on 2017/5/9.
 */
public class Test {
    public static void main(String[] args) {
        Factory factory1 = new ProductFactory1();
        Product p1 = factory1.produce();
        p1.introduce();
        Factory factory2 = new ProductFactory2();
        Product p2 = factory2.produce();
        p2.introduce();
    }
}
