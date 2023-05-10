package com.example.bigproject.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bigproject.MainActivity;
import com.example.bigproject.R;
import com.example.bigproject.database.insert;
import com.example.bigproject.login_register.DataBaseHelper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class messagepublish extends AppCompatActivity {
    private EditText title;
    private EditText content;
    private Button publish;
    private String knickname="狂砍两分一板";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_messagepublish);
        DataBaseHelper dbHelper=new DataBaseHelper(this);
        final SQLiteDatabase sdb=dbHelper.getReadableDatabase();

    }
    public void onclick(View v) {
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
                insert.add(knickname,title1,content1,date1);
                Toast.makeText(messagepublish.this, "添加成功", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(messagepublish.this, siji.class);
                startActivity(intent);

        }
    }

}
