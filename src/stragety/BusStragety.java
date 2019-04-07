package stragety;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/07
 *     desc   : 公交价格计算策略
 * </pre>
 */
public class BusStragety implements CalculateStrategy {
    /**
     * 公交车收费标准：十公里之内一元钱，超过十公里后每五公里一块钱，不足五公里按公里收取费用
     * @param km 公里
     * @return 返回价格
     */
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal/5;
        int remainder = extraFactor%5;
        int price = extraTotal + 1;
        return remainder > 0 ? ++price : price;
    }
}
