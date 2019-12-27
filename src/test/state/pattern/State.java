package test.state.pattern;

public abstract class State {
    
    //根据不同的工作时间，展示不同的工作状态
    public abstract void workStatus(Work work);

}
