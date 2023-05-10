package com.example.bigproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bigproject.R;

public class HomeFragment extends Fragment {
    private Button siji;
    private Button liuji;
    private Button xinxi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        siji=root.findViewById(R.id.button_siji);
        liuji=root.findViewById(R.id.button_liuji);
        xinxi=root.findViewById(R.id.button_xinxi);
        siji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(), siji.class);
                startActivity(intent);

            }
        });
       liuji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(), liuji.class);
                startActivity(intent);

            }
        });
    /*    xinxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getActivity(), xinxi.class);
                startActivity(intent);

            }
        });*/
        return root;
    }
}