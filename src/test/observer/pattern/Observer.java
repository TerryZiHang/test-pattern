package test.observer.pattern;

/**
 * 描述：观察接收的数据变化
 * 
 * @author Administrator
 * @date  2019年11月5日
 */
public interface Observer {
    
    void update(float temp,float humidity,float perssure);
}
