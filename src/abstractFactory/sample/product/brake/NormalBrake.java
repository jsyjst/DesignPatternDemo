package abstractFactory.sample.product.brake;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 普通制动
 * </pre>
 */
public class NormalBrake implements IBrake{
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
