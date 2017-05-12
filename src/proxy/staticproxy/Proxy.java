package proxy.staticproxy;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void oper() {
        System.out.println("before....");
        subject.oper();
        System.out.println("after....");
    }

    public static void main(String[] args) {
        Subject proxy = new Proxy(new RealSubject());
        proxy.oper();
    }

}
