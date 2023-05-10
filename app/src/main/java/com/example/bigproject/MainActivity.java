package com.example.bigproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bigproject.login_register.DataBaseHelper;
import com.example.bigproject.login_register.Userservice;
import com.example.bigproject.login_register.zhuce_activity;
import com.example.bigproject.ui.Main2Activity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.denglu);


    }
    public void onClick(View v){

        EditText password =findViewById(R.id.password);
        EditText account = findViewById(R.id.Account);
        Button login=findViewById(R.id.login);
        TextView asign=findViewById(R.id.asign);
        switch (v.getId()){
            case R.id.login:
                Userservice uService=new Userservice(this);
                String mima=password.getText().toString();
                String zhanghao=account.getText().toString();
                //boolean flag=uService.login(mima, zhanghao);
                boolean flag =true;
                if(flag==true){
                    Intent intent=new Intent(this, Main2Activity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(this, "账号或者密码错误，请重试", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.asign:
                Intent intent=new Intent(this, zhuce_activity.class);
                startActivity(intent);
                break;
        }

    }



}