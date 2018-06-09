package 设计模式.模板模式;

/**
 * Created by yans67 on 2018/6/8.
 */
public class MikeDriveTest extends DriverTestTemplate {

    @Override
    protected void selectCar() {
        System.out.println("Mike choose a handsome black color car");
    }

    @Override
    protected void login() {
        System.out.println("hello,I'm Mike");
    }

}
