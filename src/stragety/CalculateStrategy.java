package stragety;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/07
 *     desc   : 计算接口
 * </pre>
 */
public interface CalculateStrategy {
    /**
     * 按距离来计算价格
     * @param km 公里
     * @return 返回价格
     */
    int calculatePrice(int km);
}
