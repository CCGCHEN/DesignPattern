package com.canter.designpattern.strategy;

/**
 * Description :
 * Creation    : 2019/12/4
 * Author      : cangui.ccg
 */
public class MultiplyStrategy extends Strategy{

    @Override
    public double doSomthing(int num1, int num2) {
        return  num1 * num2;
    }
}
