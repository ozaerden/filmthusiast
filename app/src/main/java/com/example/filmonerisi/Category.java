package com.example.filmonerisi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Category implements Serializable {

    private List<Movie> movieList = new ArrayList<>();

    private String categoryName;
    public Category(String categoryName){
        this.categoryName = categoryName;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }


}
