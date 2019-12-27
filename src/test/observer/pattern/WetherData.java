package test.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：主题具体实现类
 * 
 * @author Administrator
 * @date  2019年11月5日
 */
public class WetherData implements Subject {

    private List<Observer> observers;

    private float temp;

    private float humidity;

    private float perssure;

    public WetherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0, len = observers.size(); i < len; i++) {
            Observer observer = observers.get(i);
            observer.update(temp, humidity, perssure);
        }
    }

    public void musurementChange() {
        notifyObservers();
    }

    public void setData(float temp, float humidity, float perssure) {
        this.temp = temp;
        this.humidity = humidity;
        this.perssure = perssure;
        musurementChange();
    }
}
