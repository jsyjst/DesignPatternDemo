package interpreter.example;

import java.util.Stack;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/05/04
 *     desc   :
 * </pre>
 */
public class Calculator {
    //声明一个栈存储并操作相关的解释器
    private Stack<ArithmeticExpression> mExpStack = new Stack<>();

    public Calculator(String expression){
        //声明两个ArithmeticExpression临时变量，存储运算符两边的数字解释器
        ArithmeticExpression exp1,exp2;
        String[] elements = expression.split(" ");

        for (int i = 0; i < elements.length ; i++) {
            switch (elements[i].charAt(0)){
                case '+'://如果是加号，
                    // 则将栈中的解释器弹出作为运算符左边的解释器
                    exp1 = mExpStack.pop();
                    //同时将运算符号下一个元素构造为一个数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    //通过两个数字解释器构造加法运算解释器
                    mExpStack.push(new AdditionExpression(exp1,exp2));
                    break;
                default://如果是数字，则直接将数字解释器压入栈
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }
    public int calculate(){
        return mExpStack.pop().interpret();
    }
}
