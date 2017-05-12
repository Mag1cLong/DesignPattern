package decorator;

/**
 * Created by Administrator on 2017/5/12.
 */
public class DecoratorB extends Decorator {
    public DecoratorB(Component component) {
        super(component);

    }

    @Override
    public void oper() {
        super.oper();
        System.out.println("DecoratorB:I do another job");
    }


}
