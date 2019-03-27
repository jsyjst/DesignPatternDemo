package factory.concreteProduct;

import factory.product.Computer;

import java.net.SocketOption;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 具体产品类-戴尔
 * </pre>
 */
public class DellComputer extends Computer {
    @Override
    public void action() {
        System.out.println("戴尔电脑开机了");
    }

    @Override
    public void shutdown() {
        System.out.println("戴尔电脑关机了");
    }
}
