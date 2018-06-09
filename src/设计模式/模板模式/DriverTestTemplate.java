package 设计模式.模板模式;

/**
 * Created by yans67 on 2018/6/8.
 * 模板类
 */
public abstract class DriverTestTemplate {

    protected String name;
    protected boolean isRight;

    // 基本方法
    protected abstract void selectCar();
    protected abstract void login();
    private void start(){
        System.out.println(this.name + "插入钥匙启动车");
    }
    protected void changeLight(){
        if (this.isRight){
            System.out.println("2. 停在右边，开左灯");
        }else{
            System.out.println("2. 停在左边，开右灯");
        }
    }
    private void hangingGear(){
        System.out.println("3. 挂挡");
    }
    private void caiyoumeng(){
        System.out.println("4. 踩油门");
    }


    protected void setRight(boolean right){
        this.isRight = right;
    }

    protected void setName(String name){
        this.name = name;
    }

    final public void run(){
        selectCar();
        login();
        start();
        changeLight();
        hangingGear();
        caiyoumeng();
    }
}
