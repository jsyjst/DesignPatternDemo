package factory.client;

import factory.concreteFactory.ConcreteFactory;
import factory.factory.Factory;
import factory.concreteProduct.ConcreteProductB;
import factory.product.Product;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 客户类
 * </pre>
 */
public class Client {
    public static void main(String [] args){
        Factory factory = new ConcreteFactory();
        Product p = factory.createProduct(ConcreteProductB.class);
        p.method();
    }
}
