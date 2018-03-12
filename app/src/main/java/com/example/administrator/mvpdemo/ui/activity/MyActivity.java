package com.example.administrator.mvpdemo.ui.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.service.struct.BaseFragment;
import com.example.administrator.mvpdemo.service.struct.FunctionManager;
import com.example.administrator.mvpdemo.service.struct.FunctionNoParamNoResult;
import com.example.administrator.mvpdemo.service.struct.FunctionOnlyParam;
import com.example.administrator.mvpdemo.service.struct.FunctionOnlyResult;
import com.example.administrator.mvpdemo.service.struct.FunctionParamAndResult;

/**
 * Created by Administrator on 2018\3\1 0001.
 */

public class MyActivity extends Activity {
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        FragmentTransaction transaction = getFragmentManager()
                .beginTransaction();
        fragment1 = (Fragment1) getFragmentManager().findFragmentByTag("f1");
        if (fragment1 == null) {
            fragment1 = new Fragment1();
            transaction.add(R.id.fragment1, fragment1, "f1");
        }
        fragment2 = (Fragment2) getFragmentManager().findFragmentByTag("f2");
        if (fragment2 == null) {
            fragment2 = new Fragment2();
            transaction.add(R.id.fragment2, fragment2, "f2");
        }
        transaction.commit();
    }


    public void setFunctionsForFragment(String tag){
        FragmentManager fm = getFragmentManager();
        BaseFragment fragment = (BaseFragment) fm.findFragmentByTag(tag);
        FunctionManager fmanger = FunctionManager.getInstance();
        fragment.setmFunctionManager(fmanger.addFunction(new FunctionNoParamNoResult(Fragment1.INTERFACE) {
            @Override
            public void function() {
                Toast.makeText(MyActivity.this,"wucan wufanhui ",Toast.LENGTH_SHORT).show();
            }
        }).addFunction(new FunctionOnlyResult<String>(Fragment2.INTERFACE_RESULT_ONLY) {
            @Override
            public String function() {
                return "么么么哒";
            }
        }).addFunction(new FunctionParamAndResult<Object,Object>("ss") {
            @Override
            public Object function(Object o) {
                return null;
            }
        }).addFunction(new FunctionOnlyParam("sss") {
            @Override
            public void function(Object o) {

            }
        }));

    }
}
