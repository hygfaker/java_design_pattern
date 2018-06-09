package 设计模式.适配器模式;

/**
 * Created by yans67 on 2018/6/10.
 *
 * 对外提供接口的源类
 */
public class Adaptee {
    public void handleRequest(String doSomething){
        System.out.println("i can support the " + doSomething);
    }
}
