package com.example.administrator.mvpdemo.service.struct;

import android.text.TextUtils;

import java.util.HashMap;

/**
 * Created by Administrator on 2018\3\1 0001.
 */

public class FunctionManager {
    private static FunctionManager ourInstance;

    public static FunctionManager getInstance() {
        if (ourInstance == null) {
            ourInstance = new FunctionManager();
        }
        return ourInstance;
    }

    private FunctionManager() {
        mFunctionNoParamNoResult = new HashMap<>();
        mFunctionOnlyParam = new HashMap<>();
        mFunctionOnlyResult = new HashMap<>();
        mFunctionParamAndResult = new HashMap<>();
    }


    private HashMap<String, FunctionNoParamNoResult> mFunctionNoParamNoResult;
    private HashMap<String, FunctionOnlyParam> mFunctionOnlyParam;
    private HashMap<String, FunctionOnlyResult> mFunctionOnlyResult;
    private HashMap<String, FunctionParamAndResult> mFunctionParamAndResult;


    public FunctionManager addFunction(FunctionNoParamNoResult function) {
        mFunctionNoParamNoResult.put(function.mFunctionName, function);
        return this;
    }


    public void invokeFunc(String funcName) throws FunctionException{
        if (TextUtils.isEmpty(funcName) == true) return;
        if (mFunctionNoParamNoResult != null) {
            FunctionNoParamNoResult f = mFunctionNoParamNoResult.get(funcName);
            if (f != null) f.function();
            if (f == null) {
                try {
                    throw new FunctionException("has no this function " + funcName);
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public FunctionManager addFunction(FunctionOnlyResult function) {
        mFunctionOnlyResult.put(function.mFunctionName, function);
        return this;
    }


    public <Result> Result invokeFunc(String funcName, Class<Result> c) throws FunctionException{
        if (TextUtils.isEmpty(funcName) == true) return null;
        if (mFunctionOnlyResult != null) {
            FunctionOnlyResult f = mFunctionOnlyResult.get(funcName);
            if (f != null) {
                if (c != null) {
                    return c.cast(f.function());
                } else {
                    return (Result) f.function();
                }
            }
            if (f == null) {
                try {
                    throw new FunctionException("has no this function " + funcName);
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;

    }


    public FunctionManager addFunction(FunctionParamAndResult function) {
        mFunctionParamAndResult.put(function.mFunctionName, function);
        return this;
    }


    public <Result,Param> Result invokeFunc(String funcName, Param param,Class<Result> c) throws FunctionException{
        if (TextUtils.isEmpty(funcName) == true) return null;
        if (mFunctionParamAndResult != null) {
            FunctionParamAndResult f = mFunctionParamAndResult.get(funcName);
            if (f != null) {
                if (c != null) {
                    return c.cast(f.function(param));
                } else {
                    return (Result) f.function(param);
                }
            }
            if (f == null) {
                try {
                    throw new FunctionException("has no this function " + funcName);
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;

    }


    public FunctionManager addFunction(FunctionOnlyParam function) {
        mFunctionOnlyParam.put(function.mFunctionName, function);
        return this;
    }


    public <Param>void invokeFunc(String funcName, Param param) throws FunctionException{
        if (TextUtils.isEmpty(funcName) == true) return;
        if (mFunctionOnlyParam != null) {
            FunctionOnlyParam f = mFunctionOnlyParam.get(funcName);
            if (f != null) f.function(param);
            if (f == null) {
                try {
                    throw new FunctionException("has no this function " + funcName);
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
