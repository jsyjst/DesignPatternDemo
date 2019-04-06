package abstractFactory.sample.factory;

import abstractFactory.sample.product.brake.IBrake;
import abstractFactory.sample.product.engine.IEngine;
import abstractFactory.sample.product.tire.ITire;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : 抽象工厂类
 * </pre>
 */
public abstract class CarFactory {
    /**
     * 生产轮胎
     * @return 轮胎
     */
    public abstract ITire createTire();

    /**
     * 生产发动机
     * @return 发动机
     */
    public abstract IEngine createEngine();

    /**
     * 产生制动系统
     * @return 制动系统
     */
    public abstract IBrake createBrake();
}
