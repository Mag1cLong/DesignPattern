package decorator;

/**
 * Created by Administrator on 2017/5/12.
 */
public class ConcreteComponent implements Component {
    @Override
    public void oper() {
        System.out.println("I do the job!");
    }
}
