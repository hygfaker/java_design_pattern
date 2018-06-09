package 设计模式.策略模式;

/**
 * Created by yans67 on 2018/6/7.
 * 主体，实行策略的角色
 */
public class Person{

    public String name;
    public Person(String name){
        this.name = name;
    }
    public void gotoSchool(ToSchoolStrategy pattern){
        System.out.println(this.name + pattern.toSchool());
    }
}
