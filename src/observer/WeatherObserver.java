package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/5/15.
 */
public class WeatherObserver implements Observer {
    private String name;
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者" +getName() +"观测到：" +((Weather) o).getReport());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
