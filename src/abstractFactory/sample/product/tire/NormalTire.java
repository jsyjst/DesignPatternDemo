package abstractFactory.sample.product.tire;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 普通轮胎
 * </pre>
 */
public class NormalTire implements ITire{

    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
