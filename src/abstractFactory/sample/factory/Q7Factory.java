package abstractFactory.sample.factory;

import abstractFactory.sample.product.brake.IBrake;
import abstractFactory.sample.product.brake.SeniorBrake;
import abstractFactory.sample.product.engine.IEngine;
import abstractFactory.sample.product.engine.ImportEngine;
import abstractFactory.sample.product.tire.ITire;
import abstractFactory.sample.product.tire.SUVTire;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/06
 *     desc   : Q7工厂类
 * </pre>
 */
public class Q7Factory extends CarFactory{
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
