package decorator;

/**
 * Created by Administrator on 2017/5/12.
 */
public class DecoratorA extends Decorator {
    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void oper() {
        super.oper();
        System.out.println("DecoratorA :I do another job");
    }
}
