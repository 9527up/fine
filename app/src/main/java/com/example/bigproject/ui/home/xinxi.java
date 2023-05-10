package com.example.bigproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bigproject.R;
import com.example.bigproject.ui.home.Adapter.myAdapter;
import com.example.bigproject.ui.home.Bean.dataBean;

import java.util.ArrayList;

public class xinxi extends AppCompatActivity {

    public static final String[] spinner_arr = {"信息共享区", "聊天交流区", "闲置交易信息发布区"};
    myAdapter adapter;
    ListView listView;
    private ArrayList<dataBean> fakedata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xinxi);

        //3个假数据
        for (int i = 0; i < 5; i++) {
            fakedata.add(new dataBean(Integer.toString(i), "理性讨论，不吹不黑", R.drawable.test));
        }

        listView = findViewById(R.id.listview);
        adapter = new myAdapter(this, R.layout.xinxi_tiezis, fakedata);
        listView.setAdapter(adapter);

        //转到发帖
        Button fatie = findViewById(R.id.fatie);
        fatie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ft = new Intent();
                ft.setClass(xinxi.this, xinxi_fatie.class);
                ft.putExtra("fatiemokuai", "信息共享区");    //假的，来不及弄可选value的传递
                startActivityForResult(ft, 1);
            }
        });

        Spinner spinner = findViewById(R.id.mokuaixuanze);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.xinxi_spinner, xinxi.spinner_arr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                dataBean xintie = (dataBean) data.getSerializableExtra("xintiezi");
                fakedata.add(xintie);
                adapter = new myAdapter(this, R.layout.xinxi_tiezis, fakedata);
                listView.setAdapter(adapter);
            }
        }
    }
}
