package com.example.bigproject.ui.friend;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.bigproject.R;
import com.example.bigproject.ui.hot.hotlistuser;

import java.util.ArrayList;
import java.util.List;

public class friendFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_frend, container, false);

        ListView friendlistview=root.findViewById(R.id.frend_listview);
        List<friendlistuser> list = new ArrayList<>(14);
        int resId1 = getResources().getIdentifier("i1","drawable","com.example.bigproject");
        friendlistuser u1 = new friendlistuser(resId1,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       12:00");
        list.add(u1);
        int resId2 = getResources().getIdentifier("i2","drawable","com.example.bigproject");
        friendlistuser u2 = new friendlistuser(resId2,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       11:00");
        list.add(u2);
        int resId3 = getResources().getIdentifier("i3","drawable","com.example.bigproject");
        friendlistuser u3 = new friendlistuser(resId3,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       10:00");
        list.add(u3);
        int resId4 = getResources().getIdentifier("i4","drawable","com.example.bigproject");
        friendlistuser u4 = new friendlistuser(resId4,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       9:00");
        list.add(u4);
        int resId5 = getResources().getIdentifier("i5","drawable","com.example.bigproject");
        friendlistuser u5 = new friendlistuser(resId5,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       8:00");
        list.add(u5);
        int resId6 = getResources().getIdentifier("i6","drawable","com.example.bigproject");
        friendlistuser u6 = new friendlistuser(resId6,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       7:00");
        list.add(u6);
        int resId7 = getResources().getIdentifier("i7","drawable","com.example.bigproject");
        friendlistuser u7 = new friendlistuser(resId7,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       6:00");
        list.add(u7);
        int resId8 = getResources().getIdentifier("i6","drawable","com.example.bigproject");
        friendlistuser u8 = new friendlistuser(resId8,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       6:00");
        list.add(u8);
        int resId9 = getResources().getIdentifier("i5","drawable","com.example.bigproject");
        friendlistuser u9 = new friendlistuser(resId9,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       6:00");
        list.add(u9);
        int resId10 = getResources().getIdentifier("i4","drawable","com.example.bigproject");
        friendlistuser u10 = new friendlistuser(resId10,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       6:00");
        list.add(u10);
        int resId11 = getResources().getIdentifier("i3","drawable","com.example.bigproject");
        friendlistuser u11 = new friendlistuser(resId11,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       6:00");
        list.add(u11);
        int resId12 = getResources().getIdentifier("i2","drawable","com.example.bigproject");
        friendlistuser u12 = new friendlistuser(resId12,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       6:00");
        list.add(u12);
        int resId13 = getResources().getIdentifier("i1","drawable","com.example.bigproject");
        friendlistuser u13 = new friendlistuser(resId13,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       6:00");
        list.add(u13);
        int resId14 = getResources().getIdentifier("i21","drawable","com.example.bigproject");
        friendlistuser u14 = new friendlistuser(resId14,"狂砍两分一板","提醒你今天是Android阶段汇报的日子","       6:00");
        list.add(u14);

        friendlistAdapter adapter=new friendlistAdapter(getActivity(),list);
        friendlistview.setAdapter(adapter);
        return root;
    }
}