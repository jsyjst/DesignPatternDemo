package abstractFactory.sample.product.engine;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 国产发动机
 * </pre>
 */
public class DomesticEngine implements IEngine{
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
