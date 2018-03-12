package com.example.administrator.mvpdemo.ui.activity;

/**
 * Created by Administrator on 2018\3\1 0001.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.service.struct.BaseFragment;
import com.example.administrator.mvpdemo.service.struct.FunctionException;

public class Fragment2 extends BaseFragment {
    public static final String INTERFACE_RESULT_ONLY = Fragment2.class.getName() + "OR";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_f2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = null;
                try {
                    s = mFunctionManager.invokeFunc(INTERFACE_RESULT_ONLY, String.class);
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
                Toast.makeText(getActivity(),s,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
