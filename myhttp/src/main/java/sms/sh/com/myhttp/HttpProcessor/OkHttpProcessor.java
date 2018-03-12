package sms.sh.com.myhttp.HttpProcessor;

import java.util.Map;

import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2018\3\6 0006.
 */

public class OkHttpProcessor implements IHttpProcessor {

    private OkHttpClient okHttpClient;

    public OkHttpProcessor(){
        okHttpClient = new OkHttpClient();
    }
    @Override
    public void Post(String url, Map<String, Object> params, ICallback callback) {

    }

    @Override
    public void get(String url, Map<String, Object> params, ICallback callback) {

    }
}
