package factory.abstractfactory;

/**
 * Created by Administrator on 2017/5/9.
 */
public class Test {
    public static void main(String[] args) {
        Factory1 factory1 = new AppleFactory();
        AppleProduct p1 = factory1.produceIPhone();
        p1.introduce();
        AppleProduct p2 = factory1.produceIPad();
        p2.introduce();

        Factory2 factory2 = new SumsungFactory();
        SumsungProduct p3 = factory2.produceNote7();
        p3.introduce();
        SumsungProduct p4 = factory2.produceS8();
        p4.introduce();
    }
}
