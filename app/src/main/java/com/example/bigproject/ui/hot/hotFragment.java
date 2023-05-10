package com.example.bigproject.ui.hot;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.example.bigproject.R;
import com.example.bigproject.login_register.DataBaseHelper;
import com.example.bigproject.ui.home.liuji;
import com.example.bigproject.ui.home.siji;

import java.util.ArrayList;
import java.util.List;

public class hotFragment extends Fragment {
    ArrayList<danyuan> zong;
    public class danyuan{
        String knickname;
        String title;
        String date;
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        ListView hotlistview=root.findViewById(R.id.hot_listview) ;

        return root;
    }
}