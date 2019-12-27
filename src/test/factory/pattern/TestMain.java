package test.factory.pattern;

/**
 * 描述：工厂模式具体包括 （符合依赖倒置原则，即依赖抽象，而不依赖具体类）
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("********************十大模式：工厂模式***************");
        /**
         * 简单工厂:通过专门定义一个类来负责创建其他类的实例
         */
//        SimpleFactory factory = new SimpleFactory();
//        factory.creatFruit("banana");
        /**
         * 静态工厂:类+静态方法
         */
//        StaticFactory.getAppleInstance();
        /**
         * 工厂方法：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个
         */
//        Factory orage = new OrangeFactory() ;
//        orage.FruitFactory();//有子工厂生成的对应的实例
        /**
         * 抽象工厂:提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
         */
        BigFactory bf = new EnglishAndAppleFactory();
        bf.fruitDeptment();
        bf.bookDeptment();
    }
    
  
}
