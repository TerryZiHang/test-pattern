package test.single.pattern;

/**
 * 描述：单例模式 饱汉
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class Singleton1 {
    
    private static Singleton1 single = new Singleton1();
    
    public Singleton1() {System.out.println("饱汉");}
    
    public static Singleton1 getInstance() {
        return single;
        
    }

}
