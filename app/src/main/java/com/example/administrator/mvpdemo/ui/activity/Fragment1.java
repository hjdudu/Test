package com.example.administrator.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.service.struct.BaseFragment;
import com.example.administrator.mvpdemo.service.struct.FunctionException;

/**
 * Created by Administrator on 2018\3\1 0001.
 */

public class Fragment1 extends BaseFragment {

    public static final String INTERFACE = Fragment1.class.getName() + "NPNR";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }


    public void onclick(View view){

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mFunctionManager.invokeFunc(INTERFACE);
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
