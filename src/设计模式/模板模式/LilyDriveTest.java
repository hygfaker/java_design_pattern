package 设计模式.模板模式;

/**
 * Created by yans67 on 2018/6/8.
 */
public class LilyDriveTest extends DriverTestTemplate {

    @Override
    protected void selectCar() {
        System.out.println("Lily choose a beautiful pink car");
    }

    @Override
    protected void login() {
        System.out.println("Hello,this is Lily");
    }






}
