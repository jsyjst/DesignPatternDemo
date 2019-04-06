package abstractFactory.common.concreteProduct;

import abstractFactory.common.product.AbstractProductB;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/03
 *     desc   : 具体产品类B1
 * </pre>
 */
public class ConcreteProductB1 extends AbstractProductB {
    @Override
    public void method() {
        System.out.println("具体产品B1的方法");
    }
}
