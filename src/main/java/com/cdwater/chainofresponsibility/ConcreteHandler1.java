package com.cdwater.chainofresponsibility;

/**
 * 具体处理者1
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 1 && request <= 3) {
            System.out.println("具体处理者1处理了请求：" + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("无人能够处理该请求：" + request);
        }
    }
}