package sms.sh.com.myhttp.HttpProcessor;

import android.app.Application;

/**
 * Created by Administrator on 2018\3\6 0006.
 */

public class MyApplication
        extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        HttpHelp.init(new volleyProcessor(this));
    }
}
