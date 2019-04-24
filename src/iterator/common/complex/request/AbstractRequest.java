package iterator.common.complex.request;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 抽象请求者
 * </pre>
 */
public abstract class AbstractRequest {
    private Object object;

    public AbstractRequest(Object object){
        this.object = object;
    }

    /**
     * 获取处理的内容对象
     * @return 具体的内容对象
     */
    public Object getContent(){
        return object;
    }

    /**
     * 获取请求级别
     * @return 级别
     */
    public abstract int getRequestLevel();
}
