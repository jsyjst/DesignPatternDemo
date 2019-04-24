package state.sample;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 电视状态接口
 * </pre>
 */
public interface TvState {
    void nextChannel();//下一频道
    void prevChannel();//上一频道
    void turnUp();//调高音量
    void turnDown();//调低音量
}
