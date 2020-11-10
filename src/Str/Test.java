package Str;

/**
 * 作者:zhaoj
 * 创建时间:2020/11/8    16:36
 * 类的作用:
 */
public class Test {
    public static void main(String[] args) {
        Context context;
        //
        context = new Context(new ConStrategyA());
        context.contextInterface();
        context = new Context(new ConStrategyB());
        context.contextInterface();
    }
}
