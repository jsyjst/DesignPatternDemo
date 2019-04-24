package iterator.common.simplify;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 抽象处理者
 * </pre>
 */
public abstract class Handler {
    protected Handler successor;//下一节点处理者

    /**
     * 请求处理
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);
}
