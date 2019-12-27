package test.single.pattern;

/**
 * 描述：单例模式主要是为了避免因为创建了多个实例造成资源的浪费，
 * 且多个实例由于多次调用容易导致结果出现错误，而使用单例模式能够保证整个应用中有且只有一个实例
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class TestMain {
    public static void main(String[] args) {
//        Singleton1.getInstance();
        Runnable r1 = new Runnable() {
            public void run() {
                Singleton2.getInstance();
            };
        };
        Runnable r2 = new Runnable() {
            public void run() {
                Singleton2.getInstance();
            };
        };
         new Thread(r1,"A").start();
         new Thread(r2,"B").start();
    }
}
