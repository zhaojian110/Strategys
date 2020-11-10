package Str;

/**
 * 作者:zhaoj
 * 创建时间:2020/11/8    16:34
 * 类的作用:
 */
//具体策略类
public class ConStrategyA extends Strategy {
    //实现抽象方法
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }

}