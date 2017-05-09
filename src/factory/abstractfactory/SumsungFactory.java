package factory.abstractfactory;

/**
 * Created by Administrator on 2017/5/9.
 */
public class SumsungFactory implements Factory2 {
    @Override
    public SumsungProduct produceNote7() {
        return new Note7();
    }

    @Override
    public SumsungProduct produceS8() {
        return new S8();
    }
}
