package iterator.common.complex.handler;

import iterator.common.complex.request.AbstractRequest;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 抽象处理者
 * </pre>
 */
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;//下一节点上的处理对象
    public final void handleRequest(AbstractRequest request){
        //判断当前处理对象级别是否与请求者的处理级别一致
        if(getHandlerLevel() == request.getRequestLevel()){
            //一致由该处理对象处理
            handle(request);
        }else{
            //否则将该请求转发给下一节点上的请求对象
            if(nextHandler!=null){
                nextHandler.handleRequest(request);
            }else{
                //当所有处理者都不能处理该request时输出
                System.out.println("All of handler can not handle the request");;
            }
        }
    }
    //获取处理者对象的处理级别
    public abstract int getHandlerLevel();
    //处理方式
    protected abstract void handle(AbstractRequest request);
}
