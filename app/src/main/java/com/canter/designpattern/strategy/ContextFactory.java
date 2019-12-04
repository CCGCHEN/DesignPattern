package com.canter.designpattern.strategy;

import android.util.Log;

/**
 * Description : 简单工程+策略模式
 * Creation    : 2019/12/4
 * Author      : cangui.ccg
 */
public class ContextFactory {

    private static final String TAG = "ContextFactory";

    public static double runFactoryStrategy(String type, int num1, int num2) {
        StrategyType strategyType = StrategyType.getType(type);
        Context context = null;
        double result = 0;
        switch (strategyType) {
            case ADD:
                context = new Context(new AddStrategy());
                result = context.doSomthing(num1, num2);
                Log.i(TAG, "<-add->" + result);
                break;
            case SUB:
                context = new Context(new SubtractStrategy());
                result = context.doSomthing(num1, num2);
                Log.i(TAG, "<-sub->" + result);
                break;
            case MUL:
                context = new Context(new MultiplyStrategy());
                result = context.doSomthing(num1, num2);
                Log.i(TAG, "<-mul->" + result);
                break;
            case DIV:
                context = new Context(new DivisionStrategy());
                result = context.doSomthing(num1, num2);
                Log.i(TAG, "<-div->" + result);
                break;
            default:
                break;
        }
        return result;
    }
}
