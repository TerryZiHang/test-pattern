package test.adapter.pattern;

public class Phone {

    private Power power;

    public Phone(Power power) {
        this.power = power;
    }

    public void charge() {
        System.out.println("充电成功：" + power.output5V()+"V");
    }
}
