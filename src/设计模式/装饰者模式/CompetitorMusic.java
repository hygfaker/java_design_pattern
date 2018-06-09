package 设计模式.装饰者模式;

/**
 * Created by yans67 on 2018/6/9.
 *
 * 具体装饰类，为参赛者添加其他修饰方法
 */
public class CompetitorMusic extends CompetitorFilter {
    public CompetitorMusic(Competitor competitor) {
        super(competitor);
    }
    // 复写方法，为被装饰者的方法添加其他内容
    public void sing(){
        // 先自我介绍
        System.out.println("hello everyone,i have music");
        super.sing();
        // 落幕
        System.out.println("music stop...goodbye everyone...");
    }

}
