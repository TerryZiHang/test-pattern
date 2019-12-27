package test.decorate.pattern;

/**
 * 描述：具体组件
 * 
 * @author Administrator
 * @date  2019年11月5日
 */
public class Espresso extends Beverage{
    
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
