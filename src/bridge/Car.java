package bridge;

/**
 * Created by Administrator on 2017/5/15.
 */
public abstract class Car {
    private Engine engine;


    public abstract void install();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
