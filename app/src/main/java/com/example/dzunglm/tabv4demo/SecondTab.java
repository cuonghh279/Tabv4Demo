package com.example.dzunglm.tabv4demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by DzungLM on 9/25/2016.
 */
public class SecondTab extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv = new TextView(getActivity());
        tv.setText("Second tab");
        tv.setWidth(LinearLayout.LayoutParams.MATCH_PARENT);
        tv.setHeight(LinearLayout.LayoutParams.MATCH_PARENT);
        tv.setBackgroundColor(Color.GREEN);
        return tv;
    }
}
