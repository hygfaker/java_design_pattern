package 设计模式.策略模式;

/**
 * Created by yans67 on 2018/6/7.
 * 具体的策略 - 走路上学
 */
public class WalkingToSchool implements ToSchoolStrategy {
    @Override
    public String toSchool() {
         return " 走路去上学 ";
    }
}
