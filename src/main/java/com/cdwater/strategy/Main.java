package com.cdwater.strategy;

/**
 * 策略模式演示
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategy1());
        context.executeStrategy();

        context.setStrategy(new ConcreteStrategy2());
        context.executeStrategy();

        context.setStrategy(new ConcreteStrategy3());
        context.executeStrategy();
    }
}
