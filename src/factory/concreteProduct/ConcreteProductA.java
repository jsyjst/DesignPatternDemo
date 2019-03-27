package factory.concreteProduct;

import factory.product.Product;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 具体产品类A
 * </pre>
 */
public class ConcreteProductA extends Product {
    @Override
    public void method() {
        System.out.println("我是具体的产品A");
    }
}
