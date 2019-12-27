package test.factory.pattern;

/**
 * 描述：工厂模式 =>静态工厂
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class StaticFactory {
    public static Fruit getAppleInstance() {
        return new Apple();
        
    }
    public static Fruit getOrangeInstance() {
        return new Orange ();
        
    }
}
