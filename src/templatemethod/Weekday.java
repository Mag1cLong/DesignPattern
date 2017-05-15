package templatemethod;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Weekday extends WeekdayTemplate {
    @Override
    protected void getUp() {
        System.out.println("起床");
    }

    @Override
    protected void wash() {
        System.out.println("洗簌");
    }

    @Override
    protected void eat() {
        System.out.println("吃饭");
    }

    @Override
    protected void work() {
        System.out.println("上班");
    }

    public static void main(String[] args) {
        Weekday weekday = new Weekday();
        weekday.doThings();
    }
}
