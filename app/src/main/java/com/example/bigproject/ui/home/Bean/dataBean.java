package com.example.bigproject.ui.home.Bean;

import java.io.Serializable;

public class dataBean implements Serializable {
    private String title;//标题
    private int ImageID;//图片数据
    private String context;//内容

    public dataBean() {//NOTHING
    }

    public dataBean(String text, int imageID) {
        this.ImageID = imageID;
        this.title = text;
    }

    public dataBean(String text1, String text2, int imageID) {
        this.ImageID = imageID;
        this.title = text1;
        this.context = text2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String text) {
        this.title = text;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public String getContext() {
        return context;
    }

    ;

    public void setContext(String text) {
        context = text;
    }
}
