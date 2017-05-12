package proxy.staticproxy;

/**
 * Created by Administrator on 2017/5/12.
 */
public class RealSubject implements Subject {
    @Override
    public void oper() {
        System.out.println("oper...");
    }
}
