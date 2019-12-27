package test.observer.pattern;

/**
 * 描述：定义了对象之间的一对多的依赖，当一个对象改变时，所有它的依赖者都会自动通知更新
 * 
 * @author Administrator
 * @date  2019年11月11日
 */
public class Test {
    public static void main(String[] args) {
        
        WetherData wetherData = new WetherData();

        DisplayElement display = new ConditionsDisplay(wetherData);

        wetherData.setData(80, 65, 32.4f);

        wetherData.setData(89, 68, 30.4f);
        
        display.display();
    }
}
