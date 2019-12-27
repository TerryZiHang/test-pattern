package test.facade.pattern;

/**
 * 描述：外观模式 把一群操作封装到一个方法中去，由一个对象统一操作
 * 定义：提供一个统一的接口，用来访问子系统中的一群接口，
 * 外观定义了一个高层的接口，让子系统更容易使用。其实就是为了方便客户的使用，把一群操作，封装成一个方法
 * 
 * @author Administrator
 * @date  2018年12月14日
 */
public class Computer {
    private Cpu cpu;
    
    private Disk disk;
    
    private Memory memory;
    
    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }
    
    public void start() {
        cpu.start();
        disk.start();
        memory.start();
        
    }
    public void close() {
        cpu.close();
        disk.close();
        memory.close();
        
        
    }
    
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("一键全开！！！！！！！");
        computer.start();
        System.out.println("一键全关！！！！！！！");
        computer.close();
    }
}
