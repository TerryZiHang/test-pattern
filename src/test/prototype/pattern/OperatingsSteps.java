package test.prototype.pattern;

/**
 * 描述：模板类
 * 
 * @author Administrator
 * @date  2018年12月14日
 */
public abstract class OperatingsSteps {
    
    /**
     * 倒油
     *
     * @date 2018年12月14日
     */
    public  void pourOil() {
        System.out.println("倒油");
    }
    
    /**
     *热油
     *
     * @date 2018年12月14日
     */
    public  void HeatOil() {
        System.out.println("热油");
    }
    
    /**
     * 材料
     *
     * @date 2018年12月14日
     */
    public abstract void pourMaking();
    
    /**
     * 配料
     *
     * @date 2018年12月14日
     */
    public abstract void mixedIngredients();

}
