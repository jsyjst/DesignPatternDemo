package factory.factory;


import factory.product.Computer;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 工厂抽象类
 * </pre>
 */
public abstract class ComputerFactory {
    /**
     * 抽象方法
     * @param concreteComputer
     * @param <T>
     * @return
     */
    public abstract <T extends Computer> T createComputer(Class<T>  concreteComputer);
}
