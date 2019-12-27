package test.strategy.pattern;

/**
 * 描述：加策略
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class Add implements CalculateStrategy {

    @Override
    public double calc(double a, double b) {
        return a+b;
    }

}
