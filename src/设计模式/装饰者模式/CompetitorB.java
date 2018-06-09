package 设计模式.装饰者模式;

/**
 * Created by yans67 on 2018/6/9.
 *
 * 参赛者 B，被装饰类
 */
public class CompetitorB implements Competitor {
    @Override
    public void sing() {
        System.out.println("CompetitorB is singing");
    }
}
