package 设计模式.装饰者模式;

/**
 * Created by yans67 on 2018/6/9.
 *
 * 装饰者类，抽象类
 */
public class CompetitorFilter implements Competitor{

    // 拥有抽象对象的引用，在装饰的时候才能获取被装饰类，以及要装饰的方法
    private Competitor competitor;

    public CompetitorFilter(Competitor competitor){
        this.competitor = competitor;
    }

    // 要装饰的方法
    @Override
    public void sing() {
        competitor.sing();
    }




}
