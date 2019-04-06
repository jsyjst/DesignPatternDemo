package abstractFactory.common.concreteProduct;

import abstractFactory.common.product.AbstractProductA;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/03
 *     desc   : 具体产品类A1
 * </pre>
 */
public class ConcreteProductA1 extends AbstractProductA {
    @Override
    public void method() {
        System.out.println("具体产品类A1的方法");
    }
}
