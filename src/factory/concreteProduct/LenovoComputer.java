package factory.concreteProduct;

import factory.product.Computer;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 具体产品类-联想品牌
 * </pre>
 */
public class LenovoComputer extends Computer {
    @Override
    public void action() {
        System.out.println("联想电脑开机了");
    }

    @Override
    public void shutdown() {
        System.out.println("联想电脑关机了");
    }
}
