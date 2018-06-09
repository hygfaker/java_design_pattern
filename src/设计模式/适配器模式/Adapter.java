package 设计模式.适配器模式;

/**
 * Created by yans67 on 2018/6/10.
 *
 * 适配器，实现了 Client 的接口，并且继承源类
 */
public class Adapter extends Adaptee implements Client{

    // 实现了 Client 的接口
    @Override
    public void reuqest(String doSomeThing) {
        // 调用源类提供的方法
        this.handleRequest(doSomeThing);
    }
}
