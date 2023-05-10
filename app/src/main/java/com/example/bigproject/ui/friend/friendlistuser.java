package com.example.bigproject.ui.friend;

public class friendlistuser {
    private int friend_picture;
    private String friend_name;
    private  String chat_content;
    private String message_time;

    public int getFriend_picture(){
        return friend_picture;
    }
    public void setFriend_picture(){
        this.friend_picture=friend_picture;
    }
    public String getFriend_name (){
        return friend_name;
    }
    public void setFriend_name (){
        this.friend_name=friend_name;
    }
    public String getChat_content (){
        return chat_content;
    }
    public void setChat_content(){
        this.chat_content=chat_content;
    }
    public String getMessage_time(){
        return message_time;
    }
    public void setMessage_time(){
        this.message_time=message_time;
    }
    public friendlistuser(int friend_picture,String friend_name,String chat_content,String message_time){
        this.friend_picture=friend_picture;
        this.friend_name=friend_name;
        this.chat_content=chat_content;
        this.message_time=message_time;

    }
}
