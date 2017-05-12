package decorator;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void oper() {
        component.oper();
    }
}
