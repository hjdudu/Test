package sms.sh.com.myhttp.HttpProcessor;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

/**
 * Created by Administrator on 2018\3\6 0006.
 * <p>
 * 真正执行请求的类
 */

public class volleyProcessor implements IHttpProcessor {
    private final RequestQueue mQueue;
    /*
    volley 使用三部曲
     */

    public volleyProcessor(Context context) {
        mQueue = Volley.newRequestQueue(context);

    }

    @Override
    public void Post(String url, Map<String, Object> params, final ICallback callback) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST
                , url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                callback.onSuccess(s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                callback.onFailure(volleyError.toString());
            }
        });
        //消息添加进队列
        mQueue.add(stringRequest);
    }

    @Override
    public void get(String url, Map<String, Object> params, final ICallback callback) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST
                , url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                callback.onSuccess(s);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                callback.onFailure(volleyError.toString());
            }
        });

        //消息添加进队列
        mQueue.add(stringRequest);

    }
}
