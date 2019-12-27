package test.decorate.pattern;

/**
 * 描述：抽象组件
 * 
 * @author Administrator
 * @date  2019年11月5日
 */
public abstract class Beverage {
    
     protected String description="";

     public String getDescription() {
        return description;
     }
     
     public abstract double cost();
}
