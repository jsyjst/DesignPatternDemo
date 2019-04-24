package state.sample;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/04/24
 *     desc   : 客户端
 * </pre>
 */
public class Client {
    public static void main(String[] args){
        TvController tvController = new TvController();
        //开机
        tvController.powerOn();
        //调高音量
        tvController.turnUp();
        //关机
        tvController.powerOff();
        //调高音量（并不会起效）
        tvController.turnUp();
    }
}
