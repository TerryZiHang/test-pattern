package test.factory.pattern;

/**
 * 描述：工厂模式 =>简单工厂：定义了一个创建对象的接口，
 * 但由子类决定要实例化类是哪一个，工厂方法让类把实例化推迟到子类
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class SimpleFactory{
    public Fruit creatFruit(String type) {
        Fruit fruit = null;
        switch (type) {
            case "banana":
                fruit = new Banana();
                break;
            case "apple":
                fruit = new Apple();
                break;
            case "orange":
                fruit = new Orange();
                break;
        }
        return fruit;
    }


    

}
