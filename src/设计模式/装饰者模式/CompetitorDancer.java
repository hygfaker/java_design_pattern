package 设计模式.装饰者模式;

/**
 * Created by yans67 on 2018/6/9.
 */
public class CompetitorDancer extends CompetitorFilter {
    public CompetitorDancer(Competitor competitor) {
        super(competitor);
    }
    public void sing(){
        // 先自我介绍
        System.out.println("hello everyone,i have dancer");
        super.sing();
        // 落幕
        System.out.println("dancer stop... goodbye everyone");
    }
}
