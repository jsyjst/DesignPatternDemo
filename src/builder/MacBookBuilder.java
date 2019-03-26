package builder;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/22
 *     desc   : 具体的Builder类，MacBookBuilder
 * </pre>
 */
public class MacBookBuilder extends Builder {
    private Computer computer = new MacBook();
    @Override
    public void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        computer.setOS();
    }


    @Override
    public Computer create() {
        return computer;
    }
}
