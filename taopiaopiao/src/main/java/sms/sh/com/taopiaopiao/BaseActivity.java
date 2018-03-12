package sms.sh.com.taopiaopiao;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import sms.sh.com.payinterface.PayInterface;

/**
 * Created by Administrator on 2018\3\1 0001.
 */

public class BaseActivity extends Activity implements PayInterface {
    protected Activity that;
    @Override
    public void attach(Activity proxyActivity) {
        that = proxyActivity;
    }

    @Override
    public void setContentView(View view) {
        that.setContentView(view);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    public Intent getIntent() {
        return super.getIntent();
    }

    @Override
    public ClassLoader getClassLoader() {
        return super.getClassLoader();
    }

    @NonNull
    @Override
    public LayoutInflater getLayoutInflater() {
        return super.getLayoutInflater();
    }

    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override
    public Window getWindow() {
        return super.getWindow();
    }

    @Override
    public WindowManager getWindowManager() {
        return super.getWindowManager();
    }


    @Override
    public void finish() {
        that.finish();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

    }
}
