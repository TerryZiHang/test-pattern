package test.single.pattern;

/**
 * 描述：单例模式 懒汉
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;
    public Singleton2() {System.out.println("懒汉");}
    
    /**
     * 考虑到多线程情况
     * synchronized修饰的静态方法锁定的是这个类的所有对象
     *
     * @return
     * @date 2018年12月13日
     */
    public synchronized static Singleton2 getInstance() {
        if(singleton2 == null) {
            singleton2 =  new Singleton2();
        }
        return singleton2;
    }
    

}
