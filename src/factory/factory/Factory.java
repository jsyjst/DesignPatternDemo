package factory.factory;

import factory.product.Product;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 抽象工厂类
 * </pre>
 */
public abstract class Factory {
    /**
     * 抽象工厂方法，具体的生产由子类实现
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> concreteProduct);
}
