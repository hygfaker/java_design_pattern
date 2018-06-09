package 设计模式.构造者模式;

/**
 * Created by yans67 on 2018/6/8.
 *
 * https://blog.csdn.net/nugongahou110/article/details/50395698
 * (上面的连接中的例子不是很好，bean 里面对 builder 耦合度太高，而且构造函数里面也耦合 builder)
 *
 * 构造者模式：实例化比较复杂的对象。
 *
 * 例子：用来创建某个比较复杂的对象，替换构造方法出现太多参数的情况，一般支持链式调用。
 * 将 new Bean() 的动作，放到 Builder 的方法中。该设计模式主要用于生产较复杂对象。
 *
 * 角色：需要实例化的 bean 对象，Builder构造器、构造器的 build 方法
 *
 * 步骤：1. 构造一个 bean，在 bean 里面创建返回 构造 Builder 类型的方法（如果有多种对象类型，则创建多个 builder）
 *      2. 构造 Builder 类，编写 bean 里面需要赋值的参数方法，并且返回this（支持链式调用）
 *      3. 编写 build 方法，用于真正的 new Bean()；
 *
 * 项目：微信中的客服消息，消息可能是文本、视频、语音、图文这些格式，因此在生成相应的
 * 对象时，是需要各种各样的参数，因此这里用TextBuilder、VedioBuilder、VoiceBuilder、NewsBuilder
 * 这几种构造器
 *
 *
 * 这里可以看 builder 里面中的示例，
 *
 */
public class Main {
    public static void main(String[] args) {
        Message message = Message.ALL().toUser("yans67").description("这是描述信息").build();
        System.out.println(message.toString());
    }

}
