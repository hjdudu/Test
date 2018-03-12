package sms.sh.com.myhttp.HttpProcessor;

/**
 * Created by Administrator on 2018\3\6 0006.
 */

public interface ICallback {
    void onSuccess(String result);
    void onFailure(String e);
}
