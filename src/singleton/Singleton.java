package singleton;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/01/20
 *     desc   : 单例模式的学习
 * </pre>
 */
public class Singleton {
    private static Singleton sInstance;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if(sInstance == null){
            sInstance = new Singleton();
        }
        return sInstance;
    }
}




