package interpreter.example;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/05/04
 *     desc   : 数字解释器，仅仅为了解释数字
 * </pre>
 */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num){
        this.num = num;
    }
    @Override
    public int interpret() {
        return num;
    }
}
