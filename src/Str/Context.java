package Str;

/**
 * 作者:zhaoj
 * 创建时间:2020/11/8    16:31
 * 类的作用:
 * Context上下文角色，也叫Context封装角色，起承上启下的作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
 */
//环境类
public class Context {
    //声明抽象策略
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口 用于引用当前的哪一种具体实现
    public void contextInterface() {
        strategy.algorithmInterface();
    }

}