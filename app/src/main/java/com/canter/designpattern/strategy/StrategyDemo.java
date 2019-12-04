package com.canter.designpattern.strategy;

import android.util.Log;

/**
 * Description :
 * Creation    : 2019/12/3
 * Author      : cangui.ccg
 */
public class StrategyDemo {

    private static final String TAG = "StrategyDemo";


    public static void runStrategy(String type) {
        Log.i(TAG, "策略模式");
        int num1 = 10;
        int num2 = 5;

        //需要知道类型、对应的策略，和Context对象

        StrategyType strategyType = StrategyType.getType(type);
        Context context = null;
        double result;
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

    }

    public static void runFactotyStrategy(String type) {
        Log.i(TAG, "简单工厂+策略模式");
        int num1 = 10;
        int num2 = 5;

        //只需要知道ContextFactory对象即可。
        double result = ContextFactory.runFactoryStrategy(type, num1, num2);
    }

}

