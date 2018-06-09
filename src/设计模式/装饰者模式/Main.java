package 设计模式.装饰者模式;

/**
 * Created by yans67 on 2018/6/9.
 *
 *
 * http://xubindehao.iteye.com/blog/474636
 *
 * 装饰者模式：可以基于某个类，动态的添加属性和方法。
 *
 *
 * 例子：歌唱比赛上，A、B 参加，A 要求有伴舞，B要求有背景音乐，这里抽象所有参赛歌手成接口，都有 sing 方法，然后每个歌手实现参赛歌手接口，
 * 实现 sing 方法，将参赛歌手的要求抽象成装饰类，伴舞、背景音乐为具体的装饰类。
 *
 * 角色：抽象被装饰类（参赛选手）、具体被装饰类（A、B）、抽象装饰类(舞台效果要求)、具体装饰类（伴舞、背景音乐）
 *
 * 1. 之所以需要抽象被装饰类，是因为当有很多个子类都需要被装饰时，需要编写很多个装饰类，因此抽象出被装饰类，我们直接对抽象类进行装饰即可。
 * 2. 之所以抽象装饰类需要实现抽象被装饰类，是因为最终我们的具体装饰类，其实也是属于抽象被装饰类的一种
 * 3. 相当于包装成一个链，每个链上的对象都会执行一次
 *
 * 步骤：1. 定义抽象被装饰接口
 *      2. 定义具体被装饰类（实现了抽象装饰类的方法）
 *      3. 定义抽象装饰类，实现抽象被装饰类，实现其方法
 *      4. 定义具体装饰类，继承了抽象装饰类，实现要添加到方法和属性
 *
 * 项目：IO 中, InputStream 就是超类，
 *             FileInputStream 就是被装饰者
 *             FilterInputStream 就是抽象装饰者类
 *             BufferedInputStream 就是具体装饰类，
 */
public class Main {
    public static void main(String[] args) {
        CompetitorA a = new CompetitorA();
        CompetitorDancer dancer = new CompetitorDancer(a);
        dancer.sing();

        CompetitorB b = new CompetitorB();
        CompetitorMusic music1 = new CompetitorMusic(b);

        music1.sing();
    }
}
