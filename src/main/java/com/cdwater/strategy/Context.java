package com.cdwater.strategy;

/**
 * 上下文类
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
        System.out.println("切换为: " + strategy.getClass().getSimpleName());
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
