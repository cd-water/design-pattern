package com.cdwater.chainofresponsibility;

/**
 * 抽象处理者
 */
public abstract class Handler {
    protected Handler nextHandler;

    /**
     * 设置下一个处理者
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理请求
     */
    public abstract void handleRequest(int request);
}