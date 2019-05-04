package interpreter.common;


/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/05/04
 *     desc   : 抽象表达式
 * </pre>
 */
public abstract class AbstractExpression {
    /**
     * 抽象的解析方法
     * @param context 上下文
     */
    public abstract void interpret(Context context);
}
