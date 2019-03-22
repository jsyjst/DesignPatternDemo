package Builder;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/22
 *     desc   :
 * </pre>
 */
public class Test {
    public static void main(String[] args){
        Builder builder = new MacBookBuilder();
        Director pcDirector = new Director(builder);
        pcDirector.construct("英特尔主板","Retina显示器");
        System.out.println("Computer info:" +builder.create().toString());
    }
}
