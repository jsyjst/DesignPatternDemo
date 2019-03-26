package prototype;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/26
 *     desc   : 测试代码，模拟客户端Client
 * </pre>
 */
public class Client {
    public static void main(String[] args){
        WordDocument originDoc = new WordDocument();
        originDoc.setText("这是一篇文档");
        originDoc.addImage("1.png");
        originDoc.addImage("2.png");
        originDoc.addImage("3.png");
        originDoc.showDocument();
        //以原始文档为原型，拷贝副本
        WordDocument doc = originDoc.clone();
        doc.showDocument();
        //修改
        doc.setText("这是修改后的的文档Doc2");
        doc.addImage("4.png");
        doc.showDocument();
        originDoc.showDocument();
    }
}
