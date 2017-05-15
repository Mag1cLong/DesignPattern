package bridge;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Benz extends Car {
    private Engine engine;

    public Benz(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void install() {
        System.out.println("benz install");
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
