package test.strategy.pattern;

/**
 * 描述：策略模式 将每一种算法都封装到具有共同接口的实现类中，让它们之间可相互替换，
 * 特点：使得算法可以在不影响客户端的情况下发生变化，从而改变不同的功能
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class TestMain {
    public static void main(String[] args) {
        Enviroment enviroment1 = new Enviroment(new Add());
        double result1 = enviroment1.calculate(10.5, 11.5);
        System.out.println(result1);
        Enviroment enviroment2 = new Enviroment(new Subtract());
        double result2 = enviroment2.calculate(15, 19);
        System.out.println(result2);
    }
}