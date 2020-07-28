package com.example.filmonerisi;

import java.io.Serializable;

public class Movie implements Serializable {

    private int id;
    private String name;
    private String director;
    private String info;
    private float imdpPoint;
    private String categoryName;
    private String photoName;

    public Movie(int id, String name, String director, String info, float imdpPoint, String categoryName, String photoName){
        this.id = id;
        this.name = name;
        this.director = director;
        this.info = info;
        this.imdpPoint = imdpPoint;
        this.categoryName = categoryName;
        this.photoName = photoName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getInfo() {
        return info;
    }

    public float getImdpPoint() {
        return imdpPoint;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getPhotoName() {
        return photoName;
    }
}
