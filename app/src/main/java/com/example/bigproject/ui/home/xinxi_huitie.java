package com.example.bigproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.bigproject.R;
import com.example.bigproject.ui.home.Adapter.myAdapter2;
import com.example.bigproject.ui.home.Bean.dataBean2;

import java.util.ArrayList;

public class xinxi_huitie extends AppCompatActivity
{
    private Toolbar tool;
    private EditText title;
    private EditText content;
    private ListView htlistview;
    private ArrayList<dataBean2> htiedata = new ArrayList<>();
    private ListView listView;
    private myAdapter2 adapter;
    private Button fasong;
    private TextView maintitle;
    private TextView maincontent;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xinxi_huitie);
        init();
    }

    protected void init()
    {
        title = (EditText) findViewById(R.id.title_s);
        content = (EditText) findViewById(R.id.content);
        htlistview = (ListView) findViewById(R.id.listview);

        //获得原帖标题内容
        Intent yuantie = getIntent();
        dataBean2 dtb2 = (dataBean2) yuantie.getSerializableExtra("dtb2");
        maintitle = findViewById(R.id.maintitle);
        maintitle.setText(dtb2.getTitle());
        maincontent = findViewById(R.id.maincontent);
        maincontent.setText(dtb2.getContext());

        htlistview = (ListView)findViewById(R.id.huities);
        adapter = new myAdapter2(this, R.layout.xinxi_huities,htiedata);
        htlistview.setAdapter(adapter);

        fasong = (Button)findViewById(R.id.fasong);
        fasong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                htiedata.add(new dataBean2(title.getText().toString(),content.getText().toString()));
                adapter = new myAdapter2(xinxi_huitie.this, R.layout.xinxi_huities,htiedata);
                htlistview.setAdapter(adapter);
                title.setText("");
                content.setText("");
            }
        });
    }

}
