package builder;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/22
 *     desc   : 抽象Builder类
 * </pre>
 */
public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);
    //设置显示器
    public abstract void buildDisplay(String display);
    //设置操作系统
    public abstract void buildOS();
    //创建Builder
    public abstract Computer create();
}
