package prototype;

import java.util.ArrayList;

/**
 * <pre>
 *     author : 残渊
 *     time   : 2019/03/26
 *     desc   : 文档类型，扮演的是ConcretePrototype角色，而cloneable是代表prototype角色
 * </pre>
 */
public class WordDocument implements Cloneable{
    private String mText;//文本
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument(){
        System.out.println("--------------------WordDocument构造函数---------------");
    }

    @Override
    protected WordDocument clone(){
        try{
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            //进行深拷贝
            doc.mImages = (ArrayList<String>) this.mImages.clone();
//            doc.mImages = this.mImages;

            return doc;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public String getText() {
        return mText;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public void addImage(String img){
        mImages.add(img);
    }

    public void showDocument(){
        System.out.println("--------------------Word Content Start---------------");
        System.out.println("Text :"+mText);
        System.out.println("Images List:");
        for(String image:mImages){
            System.out.println("image name:"+ image);
        }
        System.out.println("--------------------Word Content End---------------");
    }

}
