package 设计模式.策略模式;

/**
 * Created by yans67 on 2018/6/7.
 *
 * 该设计模式主要用于达到相同目的使用的不同策略，偏向于方法的使用
 *
 * 策略模式： 某人使用某种策略完成某个任务，这里策略是接口，某人为主体，某个任务为主题。
 *
 * 例子：小明开车上学,这里的开车，可以有两个策略，一个是开奔驰，一个是骑单车。这两个策略有个共同点，
 * 就是都需要drive 方法，因此drive 就是我们的策略要抽象的方法。
 *
 * 角色：策略接口、不同的策略实现类、使用策略的主体类
 *
 * 步骤：
 * 1. 定义策略接口，抽象行为方法：ToSchoolStrategy
 * 2. 策略的主题：CarToSchool、WalkingToSchool，实现strategy
 * 3. 执行策略的主体：
 *      解析消息、封装成 bean -》保存到数据库 -》
 * 项目：解析包、封装 bean -》保存数据库 -》响应返回
 * 联系到实际项目：上传应用的时候，分为 ipa 和 apk，两者获取包应用信息的具体细节不一样，
 * 可以抽象出 getAppInfo 接口，ipaStrategy实现类和 apkStrategy 实现类。
 */
public class Main {
    public static void main(String[] args) {
        Person xiaoming = new Person("小明");
        xiaoming.gotoSchool(new CarToSchool());
        xiaoming.gotoSchool(new WalkingToSchool());
    }
}
