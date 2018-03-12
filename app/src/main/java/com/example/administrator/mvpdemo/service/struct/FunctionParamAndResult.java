package com.example.administrator.mvpdemo.service.struct;

/**
 * Created by Administrator on 2018\3\1 0001.
 */

public abstract class FunctionParamAndResult<Result, Param> extends Function {
    public FunctionParamAndResult(String funcName) {
        super(funcName);
    }

    public abstract Result function(Param param);
}
