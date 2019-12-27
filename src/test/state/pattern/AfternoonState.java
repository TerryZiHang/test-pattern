package test.state.pattern;

public class AfternoonState extends State{

    @Override
    public void workStatus(Work work) {
        if(work.getHour() < 18) {
            System.out.println("当前时间：" + work.getHour() + "下午状态还不错，继续努力！");
        }else {
            work.setCurrent(new EveningState());
            work.working();
        }
    }

}
