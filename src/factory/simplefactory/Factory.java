package factory.simplefactory;

/**
 * 工厂模式-简单工厂
 */
public class Factory {
    public static Product produce(String name) {
        if ("Product1".equals(name)) {
            return new Product1();
        } else if ("Product2".equals(name)) {
            return new Product2();
        } else {
            throw new IllegalArgumentException("incorrect product name");
        }
    }


}
