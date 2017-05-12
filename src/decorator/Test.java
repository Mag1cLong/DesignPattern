package decorator;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Test {
    public static void main(String[] args) {
        Component component = new Decorator(new ConcreteComponent());
        component.oper();
        System.out.println("--------------------------------");
        component = new DecoratorA(new ConcreteComponent());
        component.oper();
        System.out.println("--------------------------------");
        component = new DecoratorB(new ConcreteComponent());
        component.oper();
        System.out.println("--------------------------------");
        component = new DecoratorB(new DecoratorA(new ConcreteComponent()));
        component.oper();
    }
}
