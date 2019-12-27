package test.adapter.pattern;

/**
 * 描述：具体适配(充电头)
 * 
 * @author Administrator
 * @date  2018年11月11日
 */
public class Socket extends AdapterPower implements Power{
    
    @Override
    public int output5V() {
        return Output220V() / 44;
    }

    @Override
    public int Output220V() {
        return 220;
    }
    
}
