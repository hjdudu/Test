package sms.sh.com.payinterface;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

/**
 * Created by Administrator on 2018\3\1 0001.
 */

public interface PayInterface {
    public void attach(Activity proxyActivity);
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onDestroy();
    void onSaveInstanceState(Bundle outState);
    boolean onTouchEvent(MotionEvent event);
    void onBackPressed();
}
