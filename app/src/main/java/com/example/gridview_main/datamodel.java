package com.example.gridview_main;

public class datamodel {
    String name;
    private int imgid;

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  datamodel(String  name, int imgid) {
        this.name=name;
        this.imgid = imgid;
    }


}