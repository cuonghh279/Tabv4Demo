package com.example.dzunglm.tabv4demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by DzungLM on 9/25/2016.
 */
public class FirstTab extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vi = inflater.inflate(R.layout.fistlayout, null);
        TextView tv = (TextView)vi.findViewById(R.id.textView);
        tv.setText("fadfa");
        Button bt = (Button)vi.findViewById(R.id.button);
        bt.setText("fadfa");
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "afdfa",Toast.LENGTH_SHORT).show();
            }
        });
        return vi;
    }
}
