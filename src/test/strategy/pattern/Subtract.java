package test.strategy.pattern;

/**
 * 描述：减策略
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class Subtract implements CalculateStrategy {

    @Override
    public double calc(double a, double b) {
        if((a-b) < 0 ) {
            return b-a;
        }
        return a-b;
    }

}
