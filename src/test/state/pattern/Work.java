package test.state.pattern;

/**
 * 描述：
 * 
 * @author Administrator
 * @date  2018年12月14日
 */
public class Work {
    private double hour;
    
    private boolean isFinish;
    
    private State current;
    
    public Work() {
        current = new ForenoonState();
    }
    
    public void working() {
        current.workStatus(this);
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }
    
    

}
