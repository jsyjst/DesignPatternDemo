package abstractFactory.sample.product.engine;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 进口发动机
 * </pre>
 */
public class ImportEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("进口发动机");
    }
}
