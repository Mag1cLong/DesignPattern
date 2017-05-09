package factory.abstractfactory;

/**
 * Created by Administrator on 2017/5/9.
 */
public class IPad implements AppleProduct{
    @Override
    public void introduce() {
        System.out.println("I'm IPad");
    }
}
