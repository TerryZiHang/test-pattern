package test.factory.pattern;

/**
 * 描述：简单工厂实例
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public abstract class Fruit{}
class Banana extends Fruit{

    public Banana() {
        System.out.println("Banana");
    }

}
class Apple extends Fruit{
    public Apple() {
        System.out.println("Apple");
    }
}
class Orange extends Fruit{
    public Orange() {
        System.out.println("Orange");
    }
}
/**
 * 描述：定义一个抽象工厂类
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
abstract class Factory {
    public abstract Fruit FruitFactory();
}

/**
 * 描述：苹果工厂
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
class AppleFactory extends Factory{

    @Override
    public Fruit FruitFactory() {
        return new Apple();
    }
}
/**
 * 描述：橘子工厂
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
class OrangeFactory extends Factory{

    @Override
    public Fruit FruitFactory() {
        return new Orange();
    }
}
/**
 * 描述：香蕉工厂
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
class BananaFactory extends Factory{

    @Override
    public Fruit FruitFactory() {
        return new Banana();
    }
}

abstract class Books{
    
}
class EnglishBook extends Books{
    public EnglishBook() {
        System.out.println("英语书");
    }
}
class ChineseBook extends Books{
    public ChineseBook() {
       System.out.println("语文数"); 
    }
}
class MathBook extends Books{
    public MathBook() {
       System.out.println("数学书"); 
    }
}


/**
 * 描述：父工厂
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
abstract class  BigFactory{
    public abstract Fruit fruitDeptment(); 
    
    public abstract Books bookDeptment();
}
 /**
 * 描述：英语书和苹果的两个部门的子工厂
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
class EnglishAndAppleFactory extends BigFactory{

    @Override
    public Fruit fruitDeptment() {
        return new Apple();
    }

    @Override
    public Books bookDeptment() {
        return new EnglishBook();
    }
     
 }



