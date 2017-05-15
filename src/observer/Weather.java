package observer;

import java.util.Observable;
import java.util.Random;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Weather extends Observable {
    private String report;



    void change() throws Exception {
        while (true) {
            Thread.sleep(2000);
            Random random = new Random();
            int i = random.nextInt(4);
            switch (i) {
                case 0:
                    setReport("天晴了");
                    break;
                case 1:
                    setReport("下雨了");
                    break;
                case 2:
                    setReport("打雷了");
                    break;
                case 3:
                    setReport("刮风了");
                    break;
                default:
                    setReport("下雪了");
                    break;
            }
            setChanged();
            notifyObservers("hi");
            System.out.println("--------------------");
        }
    }


    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public static void main(String[] args) throws Exception{
        Weather weather = new Weather();
        WeatherObserver a = new WeatherObserver();
        a.setName("A");
        WeatherObserver b = new WeatherObserver();
        b.setName("B");
        WeatherObserver c = new WeatherObserver();
        c.setName("C");
        weather.addObserver(c);
        weather.addObserver(b);
        weather.addObserver(a);
        weather.change();
    }

}
