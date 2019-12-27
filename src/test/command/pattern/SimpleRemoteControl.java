package test.command.pattern;

/**
 * 描述：请求命令者
 * 
 * @author Administrator
 * @date  2018年11月7日
 */
public class SimpleRemoteControl {
    
   private Command solt;
    
   public SimpleRemoteControl() {}
   
   public void setCommand(Command command) {
       solt = command;
   }
   
   public void buttonWesPressed() {
       solt.execute();
   }
    
}
