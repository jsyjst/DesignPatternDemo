package factory.concreteFactory;


import factory.factory.ComputerFactory;
import factory.product.Computer;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 具体工厂类
 * </pre>
 */
public class ConcreteComputerFactory extends ComputerFactory {
    @Override
    public <T extends Computer> T createComputer(Class<T> concreteComputer) {
        Computer computer = null;
        try{
            computer = (Computer) Class.forName(concreteComputer.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) computer;
    }
}
