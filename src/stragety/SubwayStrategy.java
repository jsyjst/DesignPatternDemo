package stragety;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/07
 *     desc   : 地铁价格计算策略
 * </pre>
 */
public class SubwayStrategy  implements CalculateStrategy {
    /**
     * 收费标准：6公里（含）内3元；6~12公里（含）4元；12~22公里（含）5元；22~32公里（含）6元；超过32公里7元
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        if(km <= 6){
            return 3;
        } else if(km <= 12){
            return 4;
        } else if(km <= 22){
            return 5;
        } else if(km <= 32){
            return 6;
        } else {
            return 7;
        }
    }
}
