package test.state.pattern;

public class NoonState extends State{

    @Override
    public void workStatus(Work work) {
        if(work.getHour() < 14) {
            System.out.println("当前时间：" + work.getHour() + "点，饿了，午饭，犯困...，午休！");
        }else {
            work.setCurrent(new AfternoonState());
            work.working();
        }
    }
}
