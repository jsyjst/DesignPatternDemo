package factory.client;

import factory.concreteFactory.ConcreteComputerFactory;
import factory.concreteProduct.AppleComputer;
import factory.concreteProduct.DellComputer;
import factory.concreteProduct.LenovoComputer;
import factory.factory.ComputerFactory;
import factory.product.Computer;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 电脑客户端
 * </pre>
 */
public class ComputerClient {
    public static void main(String[] args){
        ComputerFactory factory = new ConcreteComputerFactory();
        Computer lenovo = factory.createComputer(LenovoComputer.class);
        lenovo.action();
        lenovo.shutdown();

        Computer apple = factory.createComputer(AppleComputer.class);
        apple.action();
        apple.shutdown();

        Computer dell = factory.createComputer(DellComputer.class);
        dell.action();
        dell.shutdown();
    }
}
