package com.canter.designpattern.strategy;

import android.text.TextUtils;

/**
 * Description :
 * Creation    : 2019/12/4
 * Author      : cangui.ccg
 */
public enum  StrategyType {

    UNKNOWN("unknown"),

    ADD("+"),

    SUB("-"),

    MUL("*"),

    DIV("/");

    StrategyType(String type) {
        this.type = type;
    }

    private String type;

    public static StrategyType getType(String type) {
        for (StrategyType strategyType : StrategyType.values()) {
            if (TextUtils.equals(strategyType.type, type)) {
                return strategyType;
            }
        }
        return UNKNOWN;
    }
}
