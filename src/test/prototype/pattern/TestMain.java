package test.prototype.pattern;

/**
 * 模板模式：在不改变模板结构的前提下在子类中重新定义模板中的内容
 * 
 * @author Administrator
 * @date  2018年12月14日
 */
public class TestMain {
    public static void main(String[] args) {
        OperatingsSteps b1 = new PbInBrownSauce();
        b1.pourMaking();
        b1.mixedIngredients();
        
        OperatingsSteps b2 = new PbInBrownSauce();
        b2.pourMaking();
        b2.mixedIngredients();
    }
}
