package iterator.common.simplify;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 具体处理者1
 * </pre>
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("ConcreteHandler1")){
            System.out.println("ConcreteHandler1 handled");
        }else {
            successor.handleRequest(condition);
        }
    }
}
