package 设计模式.单例模式;

/**
 * Created by yans67 on 2018/5/26.
 */
public class Singleton {
    private Singleton(){
        System.out.print("singleton has create");
    }
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
    static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }
}
