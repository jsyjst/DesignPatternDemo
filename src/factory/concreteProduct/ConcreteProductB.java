package factory.concreteProduct;

import factory.product.Product;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 具体的产品类B
 * </pre>
 */
public class ConcreteProductB extends Product {
    @Override
    public void method() {
        System.out.println("我是具体的产品B");
    }
}
