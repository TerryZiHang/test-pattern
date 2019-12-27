package test.state.pattern;

/**
 * 状态模式： 允许一个对象在其内部状态改变时改变它的行为
 * 
 * @author Administrator
 * @date  2018年12月14日
 */
public class TestMain {
       public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.working();
        
        work.setHour(12);
        work.working();
        
        work.setHour(17);
        work.working();
        
        work.setHour(19);
        work.working();
                
    }

}
