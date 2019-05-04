package interpreter.example;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/05/04
 *     desc   : 运算符号抽象解释器，为所有运算符号解释器共性的提取
 * </pre>
 */
public abstract class OperatorExpression extends ArithmeticExpression {
    //声明两个成员变量存储运算符号两边的数字解释器
    protected ArithmeticExpression exp1,exp2;

    public OperatorExpression(ArithmeticExpression exp1,ArithmeticExpression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
