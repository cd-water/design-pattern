package com.cdwater.chainofresponsibility;

/**
 * 具体处理者2
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 4 && request <= 7) {
            System.out.println("具体处理者2处理了请求：" + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("无人能够处理该请求：" + request);
        }
    }
}