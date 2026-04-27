package com.cdwater.strategy;

/**
 * 具体策略1
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void execute() {
        System.out.println("执行策略1");
    }
}
