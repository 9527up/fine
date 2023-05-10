package com.example.bigproject.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bigproject.R;
import com.example.bigproject.database.insert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class messagepublish2 extends AppCompatActivity {
private EditText title;
private EditText content;
private Button publish;
private String knickname="狂砍两分一板";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_messagepublish2);
    }
    public void onclick4(View v) {
        switch(v.getId()) {
            case R.id.publish:
                title = findViewById(R.id.title);
                content = findViewById(R.id.content);
                publish = findViewById(R.id.publish);
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH");
                String date1 = df.format(new Date());
                String title1 = title.getText().toString();
                String content1 = content.getText().toString();
                insert insert = new insert(this);
                insert.addliuji(knickname,title1,content1,date1);
                Toast.makeText(messagepublish2.this, "添加成功", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(messagepublish2.this, liuji.class);
                startActivity(intent);

        }
    }
}
