package abstractFactory.common.concreteFactory;

import abstractFactory.common.concreteProduct.ConcreteProductA2;
import abstractFactory.common.concreteProduct.ConcreteProductB2;
import abstractFactory.common.factor.AbstractFactory;
import abstractFactory.common.product.AbstractProductA;
import abstractFactory.common.product.AbstractProductB;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 具体工厂类
 * </pre>
 */
public class ConcreateFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
