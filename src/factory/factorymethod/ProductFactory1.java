package factory.factorymethod;

/**
 * Created by Administrator on 2017/5/9.
 */
public class ProductFactory1 implements Factory{
    @Override
    public Product produce() {
        return new Product1();
    }
}
