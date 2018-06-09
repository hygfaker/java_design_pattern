package 设计模式.策略模式;

/**
 * Created by yans67 on 2018/6/7.
 * 具体的策略 - 开车上学
 */
public class CarToSchool implements ToSchoolStrategy {

    @Override
    public String toSchool() {
        return " 开奔驰去上学 ";
    }
}
