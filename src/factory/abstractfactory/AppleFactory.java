package factory.abstractfactory;

/**
 * Created by Administrator on 2017/5/9.
 */
public class AppleFactory implements Factory1 {
    @Override
    public AppleProduct produceIPhone() {
        return new IPhone();
    }

    @Override
    public AppleProduct produceIPad() {
        return new IPad();
    }
}
