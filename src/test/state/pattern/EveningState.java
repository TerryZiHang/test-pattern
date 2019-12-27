package test.state.pattern;

public class EveningState extends State {

    @Override
    public void workStatus(Work work) {
        if(work.getHour() < 18) {
            System.out.println("当前时间：" + work.getHour() + "下班了回家！");
        }else {
            System.out.println("当前时间：" +work.getHour()+"还要加班呀,想哭!");
        }
    }

}
