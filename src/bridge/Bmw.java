package bridge;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Bmw extends Car{
    private Engine engine;

    public Bmw(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void install() {
        System.out.println("bmw install");
        getEngine().addEngine();
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
