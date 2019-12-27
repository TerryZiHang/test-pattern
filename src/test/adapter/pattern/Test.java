package test.adapter.pattern;

/**
 * 描述：适配器 将以一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以合作无间
 * 
 * @author Administrator
 * @date  2018年11月11日
 */
public class Test {
    public static void main(String[] args) {
        //标准电压适配
        Power power = new Socket();
        //绑定适配器，
        Phone phone = new Phone(power);
        //充电
        phone.charge();
    }
}
