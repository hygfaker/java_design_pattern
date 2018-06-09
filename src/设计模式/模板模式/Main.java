package 设计模式.模板模式;

/**
 * Created by yans67 on 2018/6/7.
 *
 * https://blog.csdn.net/eson_15/article/details/51323902
 *
 * 该设计模式主要用于定义拥有相似行为属性的类
 *
 * 模板模式：强调提供一套有固定的前后顺序流程的模板，完美契合继承的特性。
 *
 * 例子：驾车考试时，启动车辆都是有固定的流程-- 0.选车 1.检验考生信息 2.发动，3.打方向灯，4.挂挡，5.踩油门。
 * 这里我们抽象出这些接口，并且有一个模板方法来调用这几个流程，这个模板方法就是控制整个流程的顺序，并且保证其
 * 不可变（考试一定要按照流程，不然就是错误的）。（这里使用抽象类而不是接口，主要有两个理由：
 * 1. 模板方法里面，可能会有一些方法是通用的，就可以由父类实现
 * 2. 一般会有钩子方法，所以会需要定义属性）
 *
 * 角色：模板抽象类，基本方法，模板方法，钩子方法
 *
 * 步骤：1. 定义抽象模板类
 *      2. 定义基本方法和模板方法，模板方法会用 final 表示，防止被覆写修改
 *      3. 业务类继承模板类，实现具体业务
 *
 * 项目：
 */
public class Main {
    public static void main(String[] args) {
        LilyDriveTest lily = new LilyDriveTest();
        lily.setRight(true);
        lily.setName("lily");
        lily.run();

        MikeDriveTest mike = new MikeDriveTest();
        mike.setRight(false);
        mike.setName("mike");
        mike.run();
    }
}
