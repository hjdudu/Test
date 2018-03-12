package sms.sh.com.myhttp.HttpProcessor;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Administrator on 2018\3\6 0006.
 */

public abstract class HttpCallback<Result> implements ICallback {
    @Override
    public void onSuccess(String result) {
        Gson gson = new Gson();
        Class<?> clz = analysisClassInfo(this);
        Result objResult = (Result) gson.fromJson(result, clz);
        onSuccess(objResult);
    }

    public abstract void onSuccess(Result result);


    public static Class<?> analysisClassInfo(Object o) {
        Type genType = o.getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        return (Class<?>) params[0];
    }

}
