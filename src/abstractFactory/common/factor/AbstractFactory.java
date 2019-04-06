package abstractFactory.common.factor;

import abstractFactory.common.product.AbstractProductA;
import abstractFactory.common.product.AbstractProductB;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 抽象工厂类
 * </pre>
 */
public abstract class AbstractFactory {
    /**
     * 创建产品A的对象
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品B的对象
     * @return
     */
    public abstract AbstractProductB createProductB();
}
