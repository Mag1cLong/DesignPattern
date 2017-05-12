package facade;

/**
 * Created by Administrator on 2017/5/12.
 */
public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        this.systemA = new SystemA();
        this.systemB = new SystemB();
        this.systemC = new SystemC();
    }

    public void doAB() {
        systemA.doA();
        systemB.doB();
    }

    public void doBC() {
        systemB.doB();
        systemC.doC();
    }

    public void doABC() {
        systemA.doA();
        systemB.doB();
        systemC.doC();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doAB();
        System.out.println("----------------------");
        facade.doBC();
        System.out.println("----------------------");
        facade.doABC();
    }
}
