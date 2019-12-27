package test.command.pattern;

/**
 * 描述：接收命令者
 * 
 * @author Administrator
 * @date  2018年11月7日
 */
public class Light {

    public void on() {
        System.out.println("灯亮了");
    }

    public void off() {
        System.out.println("灯灭了");
    }
}
