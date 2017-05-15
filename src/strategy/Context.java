package strategy;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.execute();
    }

    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.execute();
        context = new Context(new StrategyB());
        context.execute();
    }
}
