package test.observer.pattern;

/**
 * 描述： 主题类
 * 
 * @author Administrator
 * @date  2019年11月5日
 */
public interface Subject {
    
    void registerObserver(Observer o);
    
    void removeObserver(Observer o);
    
    void notifyObservers();

}
