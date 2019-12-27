package test.decorate.pattern;

/**
 * 描述：具体组件
 * 
 * @author Administrator
 * @date  2019年11月5日
 */
public class HouseBlend extends Beverage{
    

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
