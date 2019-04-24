package state.sample;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 电视遥控器
 * </pre>
 */
public class TvController implements PowerController {
    TvState mTvState;
    public void setTvState(TvState tvState){
        mTvState = tvState;
    }
    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机啦！");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机啦！");
    }

    public void nextChannel(){
        mTvState.nextChannel();
    }
    public void prevChannel(){
        mTvState.prevChannel();
    }
    public void turnUp(){
        mTvState.turnUp();
    }
    public void turnDown(){
        mTvState.turnDown();
    }
}
