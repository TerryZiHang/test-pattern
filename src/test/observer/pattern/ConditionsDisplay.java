package test.observer.pattern;
/**
 * 描述：观察者类
 * 
 * @author Administrator
 * @date  2019年11月5日
 */
@SuppressWarnings("unused")
public class ConditionsDisplay implements Observer, DisplayElement {

    private float temp;

    private float humidity;

    private float perssure;

    private Subject wetherData;

    public ConditionsDisplay(Subject wetherData) {
        this.wetherData = wetherData;
        wetherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ConditionsDisplay [temp=" + temp + ", humidity=" + humidity
                + ", perssure=" + perssure + "]");
    }

    @Override
    public void update(float temp, float humidity, float presure) {
        this.temp = temp;
        this.humidity = humidity;
        this.perssure = presure;
//        display();
    }
}
