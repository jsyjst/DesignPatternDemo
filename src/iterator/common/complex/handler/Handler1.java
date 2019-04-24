package iterator.common.complex.handler;

import iterator.common.complex.request.AbstractRequest;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 处理者
 * </pre>
 */
public class Handler1 extends AbstractHandler{
    @Override
    public int getHandlerLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1 handle request:"+request.getRequestLevel());
    }
}
