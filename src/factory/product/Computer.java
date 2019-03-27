package factory.product;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 抽象产品-电脑
 * </pre>
 */
public abstract class Computer {
    /**
     * 定义电脑一个行为方法，电脑开机
     */
    public abstract void action();

    /**
     * 定义电脑一个行为方法，电脑关机
     */
    public abstract void shutdown();
}
