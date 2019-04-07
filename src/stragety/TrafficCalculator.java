package stragety;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/07
 *     desc   : 公交出行价格计算器
 * </pre>
 */
public class TrafficCalculator {
    CalculateStrategy mCalculateStrategy;

    public static void main(String[] args){
        TrafficCalculator calculator = new TrafficCalculator();
        calculator.setStrategy(new BusStragety());
        System.out.println("公交乘坐16公里的价格:"+calculator.calculatePrice(16));
    }

    public void setStrategy(CalculateStrategy calculateStrategy){
        mCalculateStrategy = calculateStrategy;
    }

    public int calculatePrice(int km){
        return mCalculateStrategy.calculatePrice(km);
    }
}
