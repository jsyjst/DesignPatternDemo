package interpreter.example;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/05/04
 *     desc   : 加法运算抽象解释器
 * </pre>
 */
public class AdditionExpression extends OperatorExpression {

    public AdditionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret()+exp2.interpret();
    }
}
