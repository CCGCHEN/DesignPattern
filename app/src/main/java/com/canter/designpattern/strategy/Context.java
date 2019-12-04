package com.canter.designpattern.strategy;

/**
 * Description : 策略模式
 * Creation    : 2019/12/4
 * Author      : cangui.ccg
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double doSomthing(int num1, int num2) {
        return strategy.doSomthing(num1, num2);
    }
}
