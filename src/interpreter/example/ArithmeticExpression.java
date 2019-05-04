package interpreter.example;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/05/04
 *     desc   :
 * </pre>
 */
public abstract class ArithmeticExpression {
    /**
     * 抽象的解析方法
     * 具体的逻辑由具体的子类实现
     * @return 解析得到具体的值
     */
    public abstract int interpret();
}
