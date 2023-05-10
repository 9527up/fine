package com.example.bigproject.login_register;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    static String name="user.db";
    static int dbVersion=1;
    public DataBaseHelper(Context context) {
        super(context, name, null, dbVersion);
    }
    //只在创建的时候用一次
    public void onCreate(SQLiteDatabase db) {
        String sql="create table user(id integer primary key autoincrement,username varchar(255),password varchar(255))";
        db.execSQL(sql);
        db.execSQL("create table siji(id integer ,knickname varchar(255),title varchar(255),content text,date varchar(255));");

        db.execSQL("create table liuji(id integer ,knickname varchar(255),title varchar(255),content text,date varchar(255));");

        db.execSQL("create table wenjian(id integer  ,filename varchar(255));");
        db.execSQL("insert into wenjian values(1,'2012四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2013四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2014四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2015四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2016四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2017四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2018四六级真题.docx')");
        db.execSQL("insert into wenjian values(1,'2019四六级真题.docx')");
db.execSQL("delete from siji where title='标题1'");


        db.execSQL("insert into siji values(1,'测试者1','标题1','测试者1的内容','2019-12-18-16')");
        db.execSQL("insert into siji values(2,'测试者3','标题3','测试者3的内容','2019-12-18-16')");
        db.execSQL("insert into siji values(3,'测试者2','标题2','测试者2的内容','2019-12-18-16')");
        db.execSQL("insert into siji values(4,'测试者5','标题5','测试者5的内容','2019-12-18-16')");
        db.execSQL("insert into siji values(5,'测试者4','标题1','测试者4的内容','2019-12-18-16')");
        db.execSQL("insert into siji values(1,'测试者1','标题1','测试者1的内容','2019-12-18-16')");
        db.execSQL("insert into siji values(2,'测试者3','标题3','测试者3的内容','2019-12-18-16')");
        db.execSQL("insert into siji values(3,'测试者2','标题2','测试者2的内容','2019-12-18-16')");
        db.execSQL("insert into siji values(4,'测试者5','标题5','测试者5的内容','2019-12-18-16')");
        db.execSQL("insert into siji values(5,'测试者4','标题1','测试者4的内容','2019-12-18-16')");

        db.execSQL("insert into liuji values(1,'测试者1','标题1','测试者1的内容','2019-12-18-16')");
        db.execSQL("insert into liuji values(2,'测试者3','标题3','测试者3的内容','2019-12-18-16')");
        db.execSQL("insert into liuji values(3,'测试者2','标题2','测试者2的内容','2019-12-18-16')");
        db.execSQL("insert into liuji values(4,'测试者5','标题5','测试者5的内容','2019-12-18-16')");
        db.execSQL("insert into liuji values(5,'测试者4','标题1','测试者4的内容','2019-12-18-16')");
        db.execSQL("insert into liuji values(1,'测试者1','标题1','测试者1的内容','2019-12-18-16')");
        db.execSQL("insert into liuji values(2,'测试者3','标题3','测试者3的内容','2019-12-18-16')");
        db.execSQL("insert into liuji values(3,'测试者2','标题2','测试者2的内容','2019-12-18-16')");
        db.execSQL("insert into liuji values(4,'测试者5','标题5','测试者5的内容','2019-12-18-16')");
        db.execSQL("insert into liuji values(5,'测试者4','标题4','测试者4的内容','2019-12-18-16')");

        db.execSQL("delete from siji where title='标题1'");

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}

