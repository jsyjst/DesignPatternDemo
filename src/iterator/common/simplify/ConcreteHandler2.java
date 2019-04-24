package iterator.common.simplify;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 具体处理者2
 * </pre>
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("ConcreteHandler2")){
            System.out.println("ConcreteHandler2 handled");
        }else{
            successor.handleRequest(condition);
        }
    }
}
