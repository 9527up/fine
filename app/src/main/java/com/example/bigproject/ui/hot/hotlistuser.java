package com.example.bigproject.ui.hot;

public class hotlistuser {
    private int head_picture;
    private String knickname;
    private  String content;
    private int content_picture;

    public int getHead_picture(){
      return head_picture;
    }
    public void setHead_picture(){
        this.head_picture=head_picture;
    }
    public String getKinckname (){
        return knickname;
    }
    public void setKnickname (){
        this.knickname=knickname;
    }
    public String getContent (){
        return content;
    }
    public void setContent(){
        this.content=content;
    }
    public int getContent_picture(){
        return content_picture;
    }
    public void setContent_picture(){
        this.content_picture=content_picture;
    }
    public hotlistuser(int head_picture,String knickname,String content,int content_picture){
        this.head_picture=head_picture;
        this.knickname=knickname;
        this.content=content;
        this.content_picture=content_picture;

    }


}
