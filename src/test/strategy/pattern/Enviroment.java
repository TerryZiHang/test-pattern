package test.strategy.pattern;

/**
 * 描述：定义环境角色，内部持有一个策略类的引用
 * 
 * @author Administrator
 * @date  2018年12月13日
 */
public class Enviroment {
    private CalculateStrategy  strategy;
    
    public Enviroment(CalculateStrategy  strategy) {
        this.strategy = strategy;
    }
    public double calculate(double a ,double b) {
        return strategy.calc(a, b);
        
    }
}
