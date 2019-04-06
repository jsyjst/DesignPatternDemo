package abstractFactory.sample.product.tire;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 越野轮胎
 * </pre>
 */
public class SUVTire implements ITire{
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
