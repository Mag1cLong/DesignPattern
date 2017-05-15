package templatemethod;

/**
 * Created by Administrator on 2017/5/15.
 */
public abstract class WeekdayTemplate {
    protected abstract void getUp();
    protected abstract void wash();
    protected abstract void eat();
    protected abstract void work();
    public void doThings(){
        getUp();
        wash();
        eat();
        work();
    }


}
