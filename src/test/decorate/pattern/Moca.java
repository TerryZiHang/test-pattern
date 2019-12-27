package test.decorate.pattern;

/**
 * 描述：具体装饰者
 * 
 * @author Administrator
 * @date  2019年11月7日
 */
public class Moca extends Condiment{
    
    private Beverage beverage;
    
    public Moca (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Moca";
    }

    @Override
    public double cost() {
        return 2.0 + beverage.cost();
    }

}