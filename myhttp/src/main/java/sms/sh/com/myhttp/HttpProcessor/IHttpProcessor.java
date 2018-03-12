package sms.sh.com.myhttp.HttpProcessor;

import java.util.Map;

/**
 * Created by Administrator on 2018\3\6 0006.
 * <p>
 * <p>
 * 网络访问接口类
 */

public interface IHttpProcessor {

    //网络访问


    void Post(String url, Map<String, Object> params, ICallback callback);

    void get(String url, Map<String, Object> params, ICallback callback);
}
