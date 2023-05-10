package com.example.bigproject.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bigproject.R;
import com.example.bigproject.login_register.DataBaseHelper;

public class tiezi2 extends AppCompatActivity {
    private TextView knickname;
    private TextView date;
    private TextView title;
    private TextView content;
    private ListView commentlist;
    private Button publish;
    private EditText comment;
    private TextView commentname;
    private TextView commentc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tiezi);
        View mView = getLayoutInflater().inflate(R.layout.activity_tiezi,null);
        knickname=findViewById(R.id.knickname);
        title=findViewById(R.id.title);
        content=findViewById(R.id.content);
        date=findViewById(R.id.date);
        commentname=findViewById(R.id.commentname);
        commentc=findViewById(R.id.commentct);
        publish=findViewById(R.id.publishcomment);
        comment=mView.findViewById(R.id.commentx);
        Intent intent=getIntent();
        String title1=intent.getStringExtra("title");
        DataBaseHelper dbHelper=new DataBaseHelper(this);
        final SQLiteDatabase sdb=dbHelper.getReadableDatabase();
        String sql="select knickname,title,content,date from liuji where title=?";
        final Cursor cursor=sdb.rawQuery(sql, new String[]{title1});
        cursor.moveToNext();
        final String knickname1=cursor.getString(0);
        String title2=cursor.getString(1);
        String content1=cursor.getString(2);
        String date1=cursor.getString(3);
        //cursor.close();
        knickname.setText(knickname1);
        title.setText(title2);
        content.setText(content1);
        date.setText(date1);

        publish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String comment1="评论测试";
                commentname.setText("狂砍两分一板");
                commentc.setText(comment1);
                Toast.makeText(tiezi2.this, "发布成功", Toast.LENGTH_LONG).show();
            }
        });

    }
}
