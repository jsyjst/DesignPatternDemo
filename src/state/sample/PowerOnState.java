package state.sample;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 开机状态
 * </pre>
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
