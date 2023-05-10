package com.example.bigproject.login_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bigproject.MainActivity;
import com.example.bigproject.R;

public class zhuce_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.zhuce);
    }
    public void onclick2(View v){
        Button zhuce=findViewById(R.id.zhuce);
        TextView back_login=findViewById(R.id.back_login);
        EditText mima=findViewById(R.id.password);
        EditText zhanghao=findViewById(R.id.Account);
        switch(v.getId()){
            case R.id.zhuce:
                String zhhao=zhanghao.getText().toString();
                String mma=mima.getText().toString();
                Userservice uService=new Userservice(this);
                boolean flag=uService.register(zhhao, mma);
                if(flag==false){
                    Toast.makeText(this, "注册失败，请重试", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(this, "注册成功，返回登陆页面", Toast.LENGTH_SHORT).show();
                }
        }

    }
}
