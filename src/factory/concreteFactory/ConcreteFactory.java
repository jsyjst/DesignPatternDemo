package factory.concreteFactory;

import factory.factory.Factory;
import factory.product.Product;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/27
 *     desc   : 具体工厂类
 * </pre>
 */
public class ConcreteFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> concreteProduct) {
        Product p = null;
        try{
            p = (Product)Class.forName(concreteProduct.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T)p;
    }
}
