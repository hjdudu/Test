package com.example.administrator.mvpdemo.service.struct;

/**
 * Created by Administrator on 2018\3\1 0001.
 */

public abstract class FunctionNoParamNoResult extends Function {
    public FunctionNoParamNoResult(String funcName) {
        super(funcName);
    }

    public abstract void function();
}
