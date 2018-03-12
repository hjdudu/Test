package sms.sh.com.myhttp.HttpProcessor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2018\3\6 0006.
 * <p>
 * <p>
 * 代理类
 */

public class HttpHelp implements IHttpProcessor {

    private static IHttpProcessor mIHttpProcessor = null;

    private Map<String, Object> mParams;
    //单例模式
    private static HttpHelp _instance;

    private HttpHelp() {
        mParams = new HashMap<>();
    }

    public static HttpHelp obtain() {
        synchronized (HttpHelp.class) {
            if (_instance == null) {
                _instance = new HttpHelp();
            }
        }
        return _instance;
    }

    //设置代理
    public static void init(IHttpProcessor httpProcessor) {
        mIHttpProcessor = httpProcessor;
    }

    @Override
    public void Post(String url, Map<String, Object> params, ICallback callback) {
        final String finalUrl = getUrl(url, (HashMap) params);
        mIHttpProcessor.Post(finalUrl, params, callback);
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallback callback) {
        final String finalUrl = getUrl(url, (HashMap) params);
        mIHttpProcessor.get(finalUrl, params, callback);
    }


    public String getUrl(String urls, HashMap params) {

        String url = urls;

//添加url参数

        if (params != null) {

            Iterator it = params.keySet().iterator();

            StringBuffer sb = null;

            while (it.hasNext()) {

                String key = (String) it.next();

                String value = (String) params.get(key);

                if (sb == null) {

                    sb = new StringBuffer();

                    sb.append("?");

                } else {

                    sb.append("&");

                }

                sb.append(key);

                sb.append("=");

                sb.append(value);

            }

            url += sb.toString();

        }

        return url;

    }


}
