package abstractFactory.sample.product.brake;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 高级制动
 * </pre>
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
