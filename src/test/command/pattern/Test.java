package test.command.pattern;

/**
 * 描述： 将请求封装对象，以便使用不同的请求、队列、或者日志来参数化其他对象，命令模式也支持可撤销的操作
 * 
 * @author Administrator
 * @date  2018年11月11日
 */
public class Test {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Command command = new LightOnCommand(light);
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWesPressed();
        
        Command command2 = new LightOffCommand(light);
        simpleRemoteControl.setCommand(command2);
        simpleRemoteControl.buttonWesPressed();
    }
}
