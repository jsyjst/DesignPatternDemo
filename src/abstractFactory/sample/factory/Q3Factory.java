package abstractFactory.sample.factory;

import abstractFactory.sample.product.brake.IBrake;
import abstractFactory.sample.product.brake.NormalBrake;
import abstractFactory.sample.product.engine.DomesticEngine;
import abstractFactory.sample.product.engine.IEngine;
import abstractFactory.sample.product.tire.ITire;
import abstractFactory.sample.product.tire.NormalTire;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : Q3工厂类
 * </pre>
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
