package interpreter.example;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/05/04
 *     desc   : 客户端
 * </pre>
 */
public class Client {
    public static void main(String[] args){
        Calculator calculator = new Calculator("153 + 3589 + 118 + 535");
        System.out.println(calculator.calculate());
    }
}
