package test.prototype.pattern;

//炒蒜蓉菜心的类
public class ConcreteClass_CaiXin extends OperatingsSteps{
    @Override
    public void pourMaking() {
        System.out.println("下锅的蔬菜是菜心"); 


    }
    @Override
    public void mixedIngredients() {
        System.out.println("下锅的酱料是蒜蓉"); 
    }  
}

