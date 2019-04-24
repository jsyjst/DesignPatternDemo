package iterator.common.simplify;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 客户类
 * </pre>
 */
public class Client {
    public static void main(String [] args){
        //构造对象
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        //构造对象
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        //设置handler1的下一个节点
        handler1.successor = handler2;
        //设置handler2的下一个节点
        handler2.successor = handler1;
        //处理请求
        handler1.handleRequest("ConcreteHandler2");
    }
}
