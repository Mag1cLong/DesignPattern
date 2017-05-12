package factory.abstractfactory;

/**
 * Created by Administrator on 2017/5/12.
 */
public class IPhone implements AppleProduct {
    @Override
    public void introduce() {
        System.out.println("I'm IPhone");
    }
}
