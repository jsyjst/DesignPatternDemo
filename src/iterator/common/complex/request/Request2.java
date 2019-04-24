package iterator.common.complex.request;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 请求者
 * </pre>
 */
public class Request2 extends AbstractRequest {
    public Request2(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
