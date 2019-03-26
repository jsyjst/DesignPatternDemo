package builder;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/22
 *     desc   : 具体Computer类
 * </pre>
 */
public class MacBook extends Computer{
    protected MacBook(){}

    @Override
    public void setOS(){
        mOS = "Mac OS X 10.10";
    }
}
