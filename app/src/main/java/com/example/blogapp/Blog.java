package com.example.blogapp;

public class Blog {
    private String title,image,Desc;

    public Blog(){

    }

    public Blog(String title, String image, String desc) {
        this.title = title;
        this.image = image;
        Desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
