package abstractFactory.common.concreteFactory;

import abstractFactory.common.concreteProduct.ConcreteProductA1;
import abstractFactory.common.concreteProduct.ConcreteProductB1;
import abstractFactory.common.factor.AbstractFactory;
import abstractFactory.common.product.AbstractProductA;
import abstractFactory.common.product.AbstractProductB;
import factory.concreteProduct.ConcreteProductB;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 具体工厂类
 * </pre>
 */
public class ConcreateFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
