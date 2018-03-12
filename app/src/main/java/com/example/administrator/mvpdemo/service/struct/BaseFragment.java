package com.example.administrator.mvpdemo.service.struct;

import android.app.Fragment;
import android.content.Context;

import com.example.administrator.mvpdemo.ui.activity.MyActivity;

/**
 * Created by Administrator on 2018\3\1 0001.
 */

public class BaseFragment extends Fragment {
    public FunctionManager mFunctionManager;
    private MyActivity mBaseActivity;

    public void setmFunctionManager(FunctionManager funcName){
        this.mFunctionManager = funcName;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MyActivity){
            mBaseActivity = (MyActivity)context;
            mBaseActivity.setFunctionsForFragment(getTag());
        }
    }
}
