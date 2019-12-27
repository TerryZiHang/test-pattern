package test.decorate.pattern;

/**
 * 描述： 
 * 装饰模式：动态的将责任添加到对象上，
 * 若要扩展功能，装饰者提供比继承更有弹性的替代方案（符合开闭原则）
 * 
 * @author Administrator
 * @date  2019年11月7日
 */
public class TestMoca {
    public static void main(String[] args) {
        //实例具体组件
        Beverage beverage = new Espresso();
        //动态添加装饰到对象上
        beverage = new Moca(beverage);
        System.out.println(beverage.getDescription() +","+beverage.cost());
    }

}
