package Builder;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/22
 *     desc   : 负责构造Computer
 * </pre>
 */
public class Director {
    Builder mBuilder ;
    public Director(Builder builder){
        mBuilder = builder;
    }

    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
